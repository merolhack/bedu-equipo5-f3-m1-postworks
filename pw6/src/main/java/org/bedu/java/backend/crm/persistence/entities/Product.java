package org.bedu.java.backend.crm.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Data
@Table(name = "PRODUCTS")
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String  category;

    private float price;

    @Column(name = "record_number", length = 20)
    private String recordNumber;

    @Column(name = "creation_date")
    private LocalDate creationDate;
}
