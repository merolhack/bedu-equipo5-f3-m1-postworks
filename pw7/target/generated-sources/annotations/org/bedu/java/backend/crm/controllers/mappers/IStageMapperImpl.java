package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.StageDTO;
import org.bedu.java.backend.crm.persistence.entities.StageEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T19:28:28-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Private Build)"
)
@Component
public class IStageMapperImpl implements IStageMapper {

    @Override
    public StageEntity stageModelToStageEntity(StageDTO stageModel) {
        if ( stageModel == null ) {
            return null;
        }

        StageEntity stageEntity = new StageEntity();

        stageEntity.setStageId( stageModel.getStageId() );
        stageEntity.setName( stageModel.getName() );
        stageEntity.setStageOrder( stageModel.getStageOrder() );

        return stageEntity;
    }

    @Override
    public StageDTO stageEntityToStageModel(StageEntity stageEntity) {
        if ( stageEntity == null ) {
            return null;
        }

        StageDTO.StageDTOBuilder stageDTO = StageDTO.builder();

        stageDTO.stageId( stageEntity.getStageId() );
        stageDTO.name( stageEntity.getName() );
        stageDTO.stageOrder( stageEntity.getStageOrder() );

        return stageDTO.build();
    }
}
