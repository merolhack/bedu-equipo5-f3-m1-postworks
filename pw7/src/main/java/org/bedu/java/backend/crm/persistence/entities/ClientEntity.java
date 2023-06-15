package org.bedu.java.backend.crm.persistence.entities;

import lombok.*;

import javax.persistence.*;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Getter
@Setter
@AllArgsConstructor
@Table(name = "CLIENT")
@Entity
@NoArgsConstructor
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "mail_contact", nullable = false)
    private String mailContact;

    @Column(name = "number_employees")
    private String numberEmployees;

    private String address;
}
