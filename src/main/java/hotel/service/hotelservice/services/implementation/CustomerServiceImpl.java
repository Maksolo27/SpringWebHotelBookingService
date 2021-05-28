package hotel.service.hotelservice.services.implementation;

import hotel.service.hotelservice.entities.Customer;
import hotel.service.hotelservice.resopitories.CustomerRepository;
import hotel.service.hotelservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAll(){
        return repository.findAll();
    }

    public Customer getById(int id){
        return repository.getById(id);
    }

    public void add(Customer customer){
        repository.saveAndFlush(customer);
    }

    public void deleteById(int id){
        repository.deleteById(id);
    }

    public void update(Customer customer){
        repository.save(customer);
    }

}
