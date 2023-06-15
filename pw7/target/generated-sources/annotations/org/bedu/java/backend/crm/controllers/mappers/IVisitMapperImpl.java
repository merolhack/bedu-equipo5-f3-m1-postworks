package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.Visit;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T19:28:28-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Private Build)"
)
@Component
public class IVisitMapperImpl implements IVisitMapper {

    @Override
    public Visit visitModelToVisitEntity(Visit visitModel) {
        if ( visitModel == null ) {
            return null;
        }

        Visit.VisitBuilder visit = Visit.builder();

        visit.id( visitModel.getId() );
        visit.client( visitModel.getClient() );
        visit.scheduledDate( visitModel.getScheduledDate() );
        visit.address( visitModel.getAddress() );
        visit.reason( visitModel.getReason() );
        visit.salesPerson( visitModel.getSalesPerson() );

        return visit.build();
    }

    @Override
    public Visit visitEntityToVisitModel(Visit visit) {
        if ( visit == null ) {
            return null;
        }

        Visit.VisitBuilder visit1 = Visit.builder();

        visit1.id( visit.getId() );
        visit1.client( visit.getClient() );
        visit1.scheduledDate( visit.getScheduledDate() );
        visit1.address( visit.getAddress() );
        visit1.reason( visit.getReason() );
        visit1.salesPerson( visit.getSalesPerson() );

        return visit1.build();
    }
}
