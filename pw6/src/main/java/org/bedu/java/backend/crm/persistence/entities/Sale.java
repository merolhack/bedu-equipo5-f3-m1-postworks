package org.bedu.java.backend.crm.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Data
@Table(name = "SALES")
@Entity
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long saleId;

    private float amount;

    @OneToMany
    private List<Product> products;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private LocalDateTime creationDate;
}
