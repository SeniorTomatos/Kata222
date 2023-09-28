package web.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService {

    private final CarDao carDao;

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> cars = carDao.getCars();

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
