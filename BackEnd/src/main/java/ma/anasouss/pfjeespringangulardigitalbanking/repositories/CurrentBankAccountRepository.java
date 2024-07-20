package ma.anasouss.pfjeespringangulardigitalbanking.repositories;

import ma.anasouss.pfjeespringangulardigitalbanking.entities.CurrentAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentBankAccountRepository extends JpaRepository<CurrentAccount, String> {
}
