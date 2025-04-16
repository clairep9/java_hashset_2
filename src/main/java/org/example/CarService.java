package org.example; // Make sure this matches your package

import java.util.HashSet;
import java.util.Set;

public class CarService {
    private Set<Car> cars = new HashSet<>();

    public void addCar(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }
        cars.add(car);
    }

    public boolean removeCar(Car car) {
        return cars.remove(car);
    }

    public int getCarCount() {
        return cars.size();
    }

    public Set<Car> getCarsByMake(String make) {
        if (make == null || make.trim().isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty");
        }

        Set<Car> result = new HashSet<>();
        for (Car car : cars) {
            if (car.getMake() != null && car.getMake().equalsIgnoreCase(make)) {
                result.add(car);
            }
        }
        return result;
    }

}