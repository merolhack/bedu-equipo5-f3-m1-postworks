package org.bedu.java.backend.crm.persistence.entities;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Eduardo Hernandez ehg430@gmail.com
 */
@Data
@Table(name = "VISITS")
@Entity
@NoArgsConstructor
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Client client;

    @Column(nullable = false)
    private LocalDateTime scheduledDate;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String purpose;

    @Column(nullable = false)
    private String seller;
}
