package org.bedu.java.backend.crm.persistence;

import org.bedu.java.backend.crm.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */

public interface ISaleRepository extends JpaRepository<Sale,Long> {
}
