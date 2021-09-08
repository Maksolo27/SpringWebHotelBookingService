package hotel.service.hotelservice.controllers;

import hotel.service.hotelservice.entities.Room;
import hotel.service.hotelservice.services.implementation.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomsController {

    @Autowired
    private RoomServiceImpl roomService;

    @GetMapping
    public String getRooms(Model model){
        List<Room> roomList = roomService.getAll();
        List<Room> standardRooms = new ArrayList<>();
        List<Room> businessRooms = new ArrayList<>();
        List<Room> luxRooms = new ArrayList<>();
        List<Room> royalRooms = new ArrayList<>();
        List<Room> hardLuxRooms = new ArrayList<>();
        for (int i = 0; i < roomList.size(); i++) {
            switch (roomList.get(i).getRoomClass()){
                case STANDARD:
                    standardRooms.add(roomList.get(i));
                    break;
                case BUSINESS:
                    businessRooms.add(roomList.get(i));
                    break;
                case LUX:
                    luxRooms.add(roomList.get(i));
                    break;
                case ROYAL:
                    royalRooms.add(roomList.get(i));
                    break;
                case HARD_LUX:
                    hardLuxRooms.add(roomList.get(i));
                    break;
            }
        }
        model.addAttribute("standardRooms", standardRooms);
        model.addAttribute("businessRooms", businessRooms);
        model.addAttribute("luxRooms", luxRooms);
        model.addAttribute("royalRooms", royalRooms);
        model.addAttribute("hardLuxRooms", hardLuxRooms);
        return "rooms";
    }
}
