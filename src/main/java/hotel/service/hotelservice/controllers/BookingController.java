package hotel.service.hotelservice.controllers;

import hotel.service.hotelservice.entities.Customer;
import hotel.service.hotelservice.entities.Room;
import hotel.service.hotelservice.services.implementation.CustomerServiceImpl;
import hotel.service.hotelservice.services.implementation.RoomServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingController {

    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private CustomerServiceImpl customerService;
    private Integer roomNumber = null;


    @GetMapping
    public String getForm(Model model, @RequestParam Integer roomNumber){
        System.out.println("get");
        this.roomNumber = roomNumber;
        return "booking";
    }

    @PostMapping
    public String addCustomer(Customer customer){
        Room updateRoom = roomService.getById(roomNumber);
        updateRoom.setBooking(true);
        roomService.update(updateRoom);
        customer.setRoomId(roomNumber);
        customerService.add(customer);
        return "/greetings";
    }

}
