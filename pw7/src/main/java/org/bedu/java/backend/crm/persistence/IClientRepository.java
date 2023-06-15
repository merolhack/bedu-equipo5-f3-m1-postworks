package org.bedu.java.backend.crm.persistence;

import org.bedu.java.backend.crm.persistence.entities.ClientEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Eduardo Hernandez          ehg430@gmail.com
 * @author Francisco Javier Camas Tec francisco_camas@hotmail.com
 */

@Repository
public interface IClientRepository extends JpaRepository<ClientEntity, Long> {

}

