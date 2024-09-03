package hhbe.vk3.vk3autoprojekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hhbe.vk3.vk3autoprojekti.domain.Car;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class CarController {
    //tyhjän autolomakkeen palautus
    @GetMapping("/newcar")
    public String getNewForm(Model model) {
        model.addAttribute("car", new Car());
        return "newcarform";//.html
    }
    
    //autolomakkeelle syötettyjen tietojen vastaanotto
    @PostMapping("/savecar")
    public String saveCar(@ModelAttribute Car car, Model model) {
        System.out.println("Auton tiedot " + car);
        model.addAttribute("car", car);
        return "savedcars";
   }
    
}
