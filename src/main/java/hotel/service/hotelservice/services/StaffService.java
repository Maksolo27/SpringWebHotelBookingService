package hotel.service.hotelservice.services;

import hotel.service.hotelservice.entities.Customer;
import hotel.service.hotelservice.entities.Staff;

import java.util.List;

public interface StaffService {

    void add(Staff staff);

    void deleteById(int id);

    void update(Staff staff);

    Staff getById(int id);

    List<Staff> getAll();
}
