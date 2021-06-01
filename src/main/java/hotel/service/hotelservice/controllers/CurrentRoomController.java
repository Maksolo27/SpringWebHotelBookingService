package hotel.service.hotelservice.controllers;

import hotel.service.hotelservice.entities.Room;
import hotel.service.hotelservice.services.implementation.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/currentRoom")
public class CurrentRoomController {

    @Autowired
    private RoomServiceImpl roomService;

    @GetMapping
    public String getCuurentRoom(Model model, @RequestParam Integer number){
        Room currentRoom = roomService.getById(number);
        model.addAttribute("room", currentRoom);
        return "currentRoom";
    }
}
