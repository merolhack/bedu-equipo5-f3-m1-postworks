package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.model.Sale;
import org.mapstruct.Mapper;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Mapper(componentModel = "spring")
public interface ISaleMapper {
    Sale saleModelToSaleEntity(org.bedu.java.backend.crm.model.Sale saleModel);

    org.bedu.java.backend.crm.model.Sale saleEntityToSaleModel(Sale sale);
}
