package org.bedu.java.backend.crm.persistence;

import org.bedu.java.backend.crm.persistence.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */

public interface IProductRepository extends JpaRepository<Product,Long> {
}
