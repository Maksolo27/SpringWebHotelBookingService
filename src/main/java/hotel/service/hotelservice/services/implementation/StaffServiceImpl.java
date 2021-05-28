package hotel.service.hotelservice.services.implementation;

import hotel.service.hotelservice.entities.Staff;
import hotel.service.hotelservice.resopitories.StaffRepository;
import hotel.service.hotelservice.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository repository;

    @Override
    public void add(Staff staff) {
        repository.saveAndFlush(staff);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Staff staff) {
        repository.save(staff);
    }

    @Override
    public Staff getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Staff> getAll() {
        return repository.findAll();
    }
}
