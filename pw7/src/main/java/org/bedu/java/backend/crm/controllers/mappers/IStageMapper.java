package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.model.StageDTO;
import org.bedu.java.backend.crm.persistence.entities.StageEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 * @author Francisco Javier Camas Tec francisco_camas@hotmail.com
 */
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface IStageMapper {
    StageEntity stageModelToStageEntity(StageDTO stageModel);

    StageDTO stageEntityToStageModel(StageEntity stageEntity);
}
