package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "5") int count, ModelMap model){
        CarServiceImp carService = new CarServiceImp();
        List<Car> carList = carService.getCarList(count);
        model.addAttribute("cars", carList);
        return "cars";
    }

}
