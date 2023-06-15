package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.model.ClientDTO;
import org.bedu.java.backend.crm.persistence.entities.SaleEntity;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T19:28:28-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Private Build)"
)
@Component
public class ISaleMapperImpl implements ISaleMapper {

    @Override
    public SaleEntity saleModelToSaleEntity(ClientDTO saleModel) {
        if ( saleModel == null ) {
            return null;
        }

        SaleEntity saleEntity = new SaleEntity();

        return saleEntity;
    }

    @Override
    public ClientDTO saleEntityToSaleModel(SaleEntity sale) {
        if ( sale == null ) {
            return null;
        }

        ClientDTO.ClientDTOBuilder clientDTO = ClientDTO.builder();

        return clientDTO.build();
    }
}
