package org.bedu.java.backend.crm.services;

import java.util.List;
import java.util.Optional;

import org.bedu.java.backend.crm.model.ClientDTO;

/**
 * @author Francisco Javier Camas Tec francisco_camas@hotmail.com
 */
public interface IClientService {

    List<ClientDTO> findAllClients();

    ClientDTO saveClient(ClientDTO data);

    Optional<ClientDTO> findById(long id);

    ClientDTO updateClient(long id, ClientDTO data);

    void delete(long id);


    public long count();

}



