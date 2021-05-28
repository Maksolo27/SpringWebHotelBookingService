package hotel.service.hotelservice.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Room {

    @Id
    private int number;

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

    @Column
    private boolean inaccessible;


}
