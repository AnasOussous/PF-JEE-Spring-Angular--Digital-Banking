package ma.anasouss.pfjeespringangulardigitalbanking.dtos;

import lombok.Getter;
import lombok.Setter;
import ma.anasouss.pfjeespringangulardigitalbanking.enumirats.AccountStatus;

import java.util.Date;

@Getter
@Setter
public class BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private String currency;
    private CustomerDTO customerDTO;
}
