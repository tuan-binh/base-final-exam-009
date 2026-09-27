package org.example.registrationservice.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "registration_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RegistrationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_id", nullable = false)
    private Long eventId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "ticket_price", nullable = false, precision = 19, scale = 2)
    private Double ticketPrice;

    @Column(name = "line_total", nullable = false, precision = 19, scale = 2)
    private Double lineTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "registration_id", nullable = false)
    private Registration registration;
}