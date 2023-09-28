package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", 100, "red"));
        cars.add(new Car("Car2", 200, "blue"));
        cars.add(new Car("Car3", 300, "white"));
        cars.add(new Car("Car4", 400, "yellow"));
        cars.add(new Car("Car5", 500, "black"));
        return cars;
    }
}
