package hotel.service.hotelservice.resopitories;

import hotel.service.hotelservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CrudRepository<Customer, Long> {
    Customer getById(int id);

    Customer getByFirstName(String firstName);

    Customer getByPhone(String phone);

    Customer getByLogin(String login);
}
