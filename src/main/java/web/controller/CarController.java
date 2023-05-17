package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @RequestParam(name = "count", required = false, defaultValue = "5") int count) {
        model.addAttribute("cars", carService.showCountCars(carService.showAllCars(),count));
        return "cars";
    }

    @GetMapping("/addCar")
    public String showAddCarPage(ModelMap model) {
        model.addAttribute("carForm", new Car());
        return "addCar";
    }
}
