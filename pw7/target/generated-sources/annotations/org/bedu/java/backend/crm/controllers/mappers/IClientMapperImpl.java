package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.ClientDTO;
import org.bedu.java.backend.crm.persistence.entities.ClientEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T19:28:28-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Private Build)"
)
@Component
public class IClientMapperImpl implements IClientMapper {

    @Override
    public ClientEntity clientModelToClientEntity(ClientDTO clientModel) {
        if ( clientModel == null ) {
            return null;
        }

        ClientEntity clientEntity = new ClientEntity();

        clientEntity.setMailContact( clientModel.getContactEmail() );
        clientEntity.setNumberEmployees( clientModel.getEmployeesAmount() );
        clientEntity.setId( clientModel.getId() );
        clientEntity.setName( clientModel.getName() );
        clientEntity.setAddress( clientModel.getAddress() );

        return clientEntity;
    }

    @Override
    public ClientDTO clientEntityToClientModel(ClientEntity clientEntity) {
        if ( clientEntity == null ) {
            return null;
        }

        ClientDTO.ClientDTOBuilder clientDTO = ClientDTO.builder();

        clientDTO.contactEmail( clientEntity.getMailContact() );
        clientDTO.employeesAmount( clientEntity.getNumberEmployees() );
        if ( clientEntity.getId() != null ) {
            clientDTO.id( clientEntity.getId() );
        }
        clientDTO.name( clientEntity.getName() );
        clientDTO.address( clientEntity.getAddress() );

        return clientDTO.build();
    }
}
