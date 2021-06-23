package hotel.service.hotelservice.resopitories;

import hotel.service.hotelservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>, CrudRepository<Customer, Integer> {

    Customer getByFirstName(String firstName);

    Customer getByPhone(String phone);

    Customer getByLogin(String login);


}
