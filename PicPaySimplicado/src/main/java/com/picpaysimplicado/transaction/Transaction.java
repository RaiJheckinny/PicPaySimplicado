package com.picpaysimplicado.transaction;

import com.picpaysimplicado.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "TRANSACTIONS")
@Table(name = "TRANSACTIONS")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @JoinColumn(name = "sender_id")
    @ManyToOne
    private User sender;

    @JoinColumn(name = "reciver_id")
    @ManyToOne
    private User receiver;

    private LocalDateTime timestamp;
}
