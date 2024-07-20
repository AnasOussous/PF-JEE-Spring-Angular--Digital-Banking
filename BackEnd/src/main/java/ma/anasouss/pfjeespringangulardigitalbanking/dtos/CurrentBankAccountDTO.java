package ma.anasouss.pfjeespringangulardigitalbanking.dtos;

import lombok.Data;

@Data
public class CurrentBankAccountDTO extends BankAccountDTO {
    private double overDraft;
}
