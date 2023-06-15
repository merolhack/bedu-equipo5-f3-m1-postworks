package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.persistence.entities.Product;
import org.mapstruct.Mapper;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Mapper(componentModel = "spring")
public interface IProductMapper {
    Product productModelToProductEntity(org.bedu.java.backend.crm.model.Product productoModel);

    org.bedu.java.backend.crm.model.Product productEntityToProductModel(Product product);
}
