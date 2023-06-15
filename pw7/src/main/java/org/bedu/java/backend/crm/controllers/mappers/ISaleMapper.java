package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.model.ClientDTO;
import org.bedu.java.backend.crm.persistence.entities.SaleEntity;
import org.mapstruct.Mapper;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 * @author Francisco Javier Camas Tec francisco_camas@hotmail.com
 */
@Mapper(componentModel = "spring")
public interface ISaleMapper {
    SaleEntity saleModelToSaleEntity(org.bedu.java.backend.crm.model.ClientDTO saleModel);

    ClientDTO saleEntityToSaleModel(SaleEntity sale);
}
