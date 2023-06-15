package org.bedu.java.backend.crm.services.Impl;

import org.bedu.java.backend.crm.controllers.mappers.IStageMapper;
import org.bedu.java.backend.crm.model.StageDTO ;
import org.bedu.java.backend.crm.persistence.IStageRepository;
import org.bedu.java.backend.crm.persistence.entities.StageEntity;
import org.bedu.java.backend.crm.services.IStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class StageService implements IStageService {
    private final IStageRepository repository;
    private final IStageMapper      mapper;

    @Autowired
    public StageService(IStageRepository repository, IStageMapper mapper) {
        this.repository = repository;
        this.mapper     = mapper;
    }

    @Override
    public List<StageDTO> findAllStages() {
        return repository.findAll().stream().map(stage -> mapper.stageEntityToStageModel(stage) ).toList();
    }
    @Override
    public Optional<StageDTO> findById(long idStage) {
        Optional<StageEntity> guest = repository.findById(idStage);
        return guest.isPresent() ? Optional.of(mapper.stageEntityToStageModel(guest.get())) :Optional.empty();
    }
    @Override
    public StageDTO saveStage(StageDTO stageDTO) {
        return mapper.stageEntityToStageModel (
                repository.save (mapper.stageModelToStageEntity (stageDTO))
        );
    }

    @Override
    public StageDTO updateStage(long id, StageDTO stageDTO) {
        Optional<StageEntity> actual = repository.findById(id);

        if (!actual.isPresent()) {
            //     throw new ClientNotFoundException("Client not found");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The Stage that do you want to update does not exist.");
        }

        return mapper.stageEntityToStageModel(
                repository.save(mapper.stageModelToStageEntity(stageDTO))
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
