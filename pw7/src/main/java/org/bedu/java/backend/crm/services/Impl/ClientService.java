package org.bedu.java.backend.crm.services.Impl;

import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.crm.controllers.handlers.ClientNotFoundException;
import org.bedu.java.backend.crm.persistence.entities.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.bedu.java.backend.crm.controllers.mappers.IClientMapper;
import org.bedu.java.backend.crm.model.ClientDTO;

import org.bedu.java.backend.crm.persistence.IClientRepository;
import org.bedu.java.backend.crm.services.IClientService;
import org.springframework.web.server.ResponseStatusException;

/**
 * @author Francisco Javier Camas Tec  francisco_Camas@hotmail.com
 */


@Service
public class ClientService implements IClientService {

    private final IClientRepository repository;
    private final IClientMapper mapper;

    @Autowired
    public ClientService(IClientRepository repository, IClientMapper mapper) {
        this.repository = repository;
        this.mapper     = mapper;
    }

    @Override
    public List<ClientDTO> findAllClients() {
        return repository.findAll().stream().map(client -> mapper.clientEntityToClientModel(client)).toList();// .collect(Collectors.toList());
    }
    @Override
    public Optional<ClientDTO> findById(long idClient) {
        Optional<ClientEntity> guest = repository.findById(idClient);
        return guest.isPresent() ? Optional.of(mapper.clientEntityToClientModel(guest.get())) :Optional.empty();
    }
    @Override
    public ClientDTO saveClient(ClientDTO client) {
        return mapper.clientEntityToClientModel (
                repository.save (mapper.clientModelToClientEntity (client))
        );
    }

    @Override
    public ClientDTO updateClient(long id, ClientDTO clientDTO) {
        Optional<ClientEntity> actual = repository.findById(id);

        if (!actual.isPresent()) {
        //     throw new ClientNotFoundException("Client not found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The client that do you want to update does not exist.");
        }

        return mapper.clientEntityToClientModel(
                repository.save(mapper.clientModelToClientEntity(clientDTO))
        );

    }


    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
