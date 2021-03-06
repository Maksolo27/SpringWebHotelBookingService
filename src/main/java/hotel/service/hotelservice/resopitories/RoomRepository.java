package hotel.service.hotelservice.resopitories;

import hotel.service.hotelservice.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>, CrudRepository<Room, Integer> {

    Room getAllByBooking(boolean booking);
}
