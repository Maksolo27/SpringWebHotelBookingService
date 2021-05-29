package hotel.service.hotelservice.controllers;

import hotel.service.hotelservice.entities.Customer;
import hotel.service.hotelservice.entities.Room;
import hotel.service.hotelservice.services.implementation.CustomerServiceImpl;
import hotel.service.hotelservice.services.implementation.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private RoomServiceImpl roomService;
    @Autowired
    private CustomerServiceImpl customerService;
    private Integer roomNumber = 0;


    @GetMapping
    public String getForm(@RequestParam(required = false) Integer roomNumber){
        this.roomNumber = roomNumber;
        return "booking";
    }

    @PostMapping
    public String addCustomer(Customer customer){
        customerService.add(customer);
        return "/greetings";
    }

}
