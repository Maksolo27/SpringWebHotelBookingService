package hotel.service.hotelservice.services;

import hotel.service.hotelservice.entities.Customer;

import java.util.List;

public interface CustomerService {

    void add(Customer customer);

    void deleteById(int id);

    void update(Customer customer);

    Customer getById(int id);

    List<Customer> getAll();

}
