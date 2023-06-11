package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.persistence.entities.Stage;
import org.mapstruct.Mapper;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Mapper(componentModel = "spring")
public interface IStageMapper {
    Stage stageModelToStageEntity(org.bedu.java.backend.crm.model.Stage stageModel);

    org.bedu.java.backend.crm.model.Stage stageEntityToStageModel(Stage stage);
}
