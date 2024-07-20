package ma.anasouss.pfjeespringangulardigitalbanking.repositories;

import ma.anasouss.pfjeespringangulardigitalbanking.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
