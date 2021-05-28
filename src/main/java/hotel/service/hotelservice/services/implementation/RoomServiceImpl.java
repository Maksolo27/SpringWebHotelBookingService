package hotel.service.hotelservice.services.implementation;

import hotel.service.hotelservice.entities.Room;
import hotel.service.hotelservice.resopitories.RoomRepository;
import hotel.service.hotelservice.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository repository;

    @Override
    public void add(Room room) {
        repository.saveAndFlush(room);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Room room) {
        repository.save(room);
    }

    @Override
    public Room getById(int id) {
        return repository.getById(id);
    }

    @Override
    public List<Room> getAll() {
        return repository.findAll();
    }
}
