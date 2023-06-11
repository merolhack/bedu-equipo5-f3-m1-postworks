package org.bedu.java.backend.crm.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Data
@Table(name = "CLIENT")
@Entity
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "mail_contact", nullable = false)
    private String mailContact;

    @Column(name = "number_employees")
    private String numberEmployees;

    private String addrees;
}
