package org.bedu.java.backend.crm.controllers.mappers;

import javax.annotation.processing.Generated;
import org.bedu.java.backend.crm.persistence.entities.Product;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-14T19:28:28-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Private Build)"
)
@Component
public class IProductMapperImpl implements IProductMapper {

    @Override
    public Product productModelToProductEntity(org.bedu.java.backend.crm.model.Product productoModel) {
        if ( productoModel == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productoModel.getId() );
        product.setName( productoModel.getName() );
        product.setCategory( productoModel.getCategory() );
        product.setPrice( productoModel.getPrice() );
        product.setCreationDate( productoModel.getCreationDate() );

        return product;
    }

    @Override
    public org.bedu.java.backend.crm.model.Product productEntityToProductModel(Product product) {
        if ( product == null ) {
            return null;
        }

        org.bedu.java.backend.crm.model.Product.ProductBuilder product1 = org.bedu.java.backend.crm.model.Product.builder();

        product1.id( product.getId() );
        product1.name( product.getName() );
        product1.category( product.getCategory() );
        product1.price( product.getPrice() );
        product1.creationDate( product.getCreationDate() );

        return product1.build();
    }
}
