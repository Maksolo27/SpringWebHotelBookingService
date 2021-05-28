package hotel.service.hotelservice.services;

import hotel.service.hotelservice.entities.Customer;
import hotel.service.hotelservice.entities.Room;

import java.util.List;

public interface RoomService {

    void add(Room room);

    void deleteById(int id);

    void update(Room room);

    Room getById(int id);

    List<Room> getAll();
}
