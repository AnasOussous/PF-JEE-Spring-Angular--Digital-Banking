package ma.anasouss.pfjeespringangulardigitalbanking.mappers;

import ma.anasouss.pfjeespringangulardigitalbanking.dtos.*;
import ma.anasouss.pfjeespringangulardigitalbanking.entities.*;
import ma.anasouss.pfjeespringangulardigitalbanking.dtos.*;
import ma.anasouss.pfjeespringangulardigitalbanking.entities.*;

public interface IAppMapper {
    Customer toCustomer(CustomerDTO customerDTO);

    CustomerDTO toCustomerDTO(Customer customer);

    CurrentBankAccountDTO toCurrentBankAccountDTO(CurrentAccount currentBankAccount);

    CurrentAccount toCurrentBankAccount(CurrentBankAccountDTO currentBankAccountDTO);

    SavingBankAccountDTO toSavingBankAccountDTO(SavingAccount savingBankAccount);

    SavingAccount toSavingBankAccount(SavingBankAccountDTO savingBankAccountDTO);

    BankAccountDTO toBankAccountDTO(BankAccount bankAccount);

    BankAccount toBankAccount(BankAccountDTO bankAccountDTO);

    OperationDTO toOperationDTO(Operation operation);

    Operation toOperation(OperationDTO operationDTO);
}
