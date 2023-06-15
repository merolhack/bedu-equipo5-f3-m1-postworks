package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.persistence.entities.ClientEntity;
import org.bedu.java.backend.crm.model.ClientDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * @author Eduardo Hernandez            ehg430@gmail.com
 * @author Francisco Javier Camas Tec   francisco_camas@hotmail.com
 */

//@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface IClientMapper {
    @Mapping(source = "contactEmail",    target = "mailContact")
    @Mapping(source = "employeesAmount", target = "numberEmployees")
    ClientEntity clientModelToClientEntity(ClientDTO clientModel);

    @Mapping(source = "mailContact",      target = "contactEmail")
    @Mapping(source = "numberEmployees", target = "employeesAmount")
    ClientDTO clientEntityToClientModel(ClientEntity clientEntity);
}
