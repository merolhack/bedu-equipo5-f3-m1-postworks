package org.bedu.java.backend.crm.controllers.mappers;

import org.bedu.java.backend.crm.model.Visit;
import org.mapstruct.Mapper;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Mapper(componentModel = "spring")
public interface IVisitMapper {
    Visit visitModelToVisitEntity(org.bedu.java.backend.crm.model.Visit visitModel);

    org.bedu.java.backend.crm.model.Visit visitEntityToVisitModel(Visit visit);
}
