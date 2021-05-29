package hotel.service.hotelservice.controllers;

import hotel.service.hotelservice.entities.Room;
import hotel.service.hotelservice.services.implementation.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomsController {

    @Autowired
    private RoomServiceImpl roomService;

    @GetMapping
    public String getRooms(Model model){
        List<Room> roomList = roomService.getAll();
        model.addAttribute("roomList", roomList);
        return "rooms";
    }
}
