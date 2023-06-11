package org.bedu.java.backend.crm.persistence;

import org.bedu.java.backend.crm.persistence.entities.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */

public interface IStageRepository extends JpaRepository<Stage,Long> {
}
