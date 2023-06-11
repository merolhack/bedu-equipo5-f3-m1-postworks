package org.bedu.java.backend.crm.persistence;

import org.bedu.java.backend.crm.persistence.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */

public interface IClientReposity extends JpaRepository<Client, Long> { }

