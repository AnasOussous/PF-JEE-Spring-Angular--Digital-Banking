package ma.anasouss.pfjeespringangulardigitalbanking.repositories;

import ma.anasouss.pfjeespringangulardigitalbanking.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> findByCustomerId(Long id);
}
