
package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService{
    @Override
    public List<Car> getCarList(int count) {
        List<Car> carList=new ArrayList<>();
        carList.add(new Car("Car1","White",123));
        carList.add(new Car("Car2","Black", 321));
        carList.add(new Car("Car3","Red",69));
        carList.add(new Car("Car4","Green",228));
        carList.add(new Car("Car5","Blue",727));

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}