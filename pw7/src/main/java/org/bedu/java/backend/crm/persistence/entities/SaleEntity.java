package org.bedu.java.backend.crm.persistence.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Eduardo Hernandez           ehg430@gmail.com
 * @author Francisco Javier Camas Tes  francisco_camas@hotmail.com
 */
@Getter
@Setter
@AllArgsConstructor
@Table(name = "SALES")
@Entity
@NoArgsConstructor
public class SaleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;

    private float amount;

    @OneToMany
    private List<Product> products;

    @ManyToOne
    private ClientEntity client;

    @Column(nullable = false)
    private LocalDateTime creationDate;
}
