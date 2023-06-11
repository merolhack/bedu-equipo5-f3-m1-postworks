package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.persistence.entities.Client;
import org.mapstruct.Mapper;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Mapper(componentModel = "spring")
public interface IClientMapper {
    Client clientModelToClientEntity(org.bedu.java.backend.crm.model.Client clientModel);

    org.bedu.java.backend.crm.model.Client clientEntityToClientModel(Client client);
}
