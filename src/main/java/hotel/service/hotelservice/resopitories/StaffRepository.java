package hotel.service.hotelservice.resopitories;

import hotel.service.hotelservice.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>, CrudRepository<Staff, Integer> {
}
