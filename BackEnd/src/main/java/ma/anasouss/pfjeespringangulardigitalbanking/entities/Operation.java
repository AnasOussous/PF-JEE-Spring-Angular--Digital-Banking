package ma.anasouss.pfjeespringangulardigitalbanking.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.anasouss.pfjeespringangulardigitalbanking.enumirats.OperationType;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    private String description;
    @ManyToOne
    private BankAccount account;
}
