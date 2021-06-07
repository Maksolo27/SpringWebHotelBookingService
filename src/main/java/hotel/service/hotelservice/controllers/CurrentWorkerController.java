package hotel.service.hotelservice.controllers;

import hotel.service.hotelservice.entities.Staff;
import hotel.service.hotelservice.services.implementation.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/currentWorker")
public class CurrentWorkerController {

    @Autowired
    private StaffServiceImpl staffService;

    @GetMapping
    public String getCurrentWorker(Model model, @RequestParam(required = false) int id){
        Staff currentWorker = staffService.getById(id);
        model.addAttribute("worker", currentWorker);
        return "currentWorker";
    }
}
