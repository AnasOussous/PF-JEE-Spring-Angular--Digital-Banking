package ma.anasouss.pfjeespringangulardigitalbanking.repositories;

import ma.anasouss.pfjeespringangulardigitalbanking.entities.SavingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SavingBankAccountRepository extends JpaRepository<SavingAccount, String> {
}
