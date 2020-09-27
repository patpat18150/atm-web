package th.ac.ku.atm.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.atm.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
