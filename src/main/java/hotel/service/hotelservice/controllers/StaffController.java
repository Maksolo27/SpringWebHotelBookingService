package hotel.service.hotelservice.controllers;

import hotel.service.hotelservice.entities.Staff;
import hotel.service.hotelservice.services.implementation.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffServiceImpl staffService;

    @GetMapping
    public String getStaff(Model model){
        List<Staff> stafflist = staffService.getAll();
        model.addAttribute("staffList", stafflist);
        return "staff";
    }
}
