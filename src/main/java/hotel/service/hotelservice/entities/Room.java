package hotel.service.hotelservice.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class Room {

    @Id
    private long number;

    @Column
    private int persons;

    @Column
    private int rooms;

    @Column
    private double price;

    @Column(name = "class")
    @Enumerated(value = EnumType.STRING)
    private RoomClass roomClass;

    @Column
    private int floor;

    @Column
    private boolean booking;

    @Column(name = "booking_time")
    private int bookingTime;

    @Column
    private boolean inaccessible;


}
