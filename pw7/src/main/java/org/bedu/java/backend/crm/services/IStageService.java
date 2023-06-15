package org.bedu.java.backend.crm.services;

import org.bedu.java.backend.crm.model.SaleDTO;
import org.bedu.java.backend.crm.model.StageDTO;

import java.util.List;
import java.util.Optional;

/**
 * @author Francisco Javier Camas Tec francisco_camas@hotmail.com
 */
public interface IStageService {

    List<StageDTO> findAllStages();

    StageDTO saveStage(StageDTO stageDTO);

    Optional<StageDTO> findById(long id);

    StageDTO updateStage(long id, StageDTO data);

    void delete(long id);


    public long count();

}
