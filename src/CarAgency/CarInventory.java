package CarAgency;

import java.util.ArrayList;

public class CarInventory {
    private static CarInventory instance;
    private ArrayList<Car> cars;

    private CarInventory() {
        cars = new ArrayList<>();
        CarFactory carFactory = new CarFactoryImpl();
        cars.add(carFactory.createCar("TOYOTA", "corolla", 2001, "", true, 200000, 500));
        cars.add(carFactory.createCar("TOYOTA", "Camry", 2005, "", true, 280000, 800));
        cars.add(carFactory.createCar("BMW", "X5", 1980, "", true, 300000, 300));
        cars.add(carFactory.createCar("NISSAN", "Versa ", 2010, "", true, 350000, 250));
        cars.add(carFactory.createCar("PORSCHE", "af1", 2014, "", true, 180000, 320));
        cars.add(carFactory.createCar("Mercedes", "c100", 2015, "", true, 450000, 800));
        cars.add(carFactory.createCar("CHEVROLET", "Labo ", 2009, "", true, 340000, 650));
        cars.add(carFactory.createCar("JEEP", "Wrangler", 2019, "", true, 540000, 1000));
        cars.add(carFactory.createCar("BMW", "X3", 2020, "", true, 580000, 1350));
        cars.add(carFactory.createCar("Mercedes", "GLC ", 2020, "", true, 530000, 1200));
        cars.add(carFactory.createCar("TOYOTA", "corolla", 2013, "", true, 460000, 850));
        cars.add(carFactory.createCar("NISSAN", "Sunny  ", 2004, "", true, 370000, 750));
        cars.add(carFactory.createCar("JEEP", "Wrangler", 2017, "", true, 580000, 1100));
        cars.add(carFactory.createCar("BMW", "M60i ", 2023, "", true, 670000, 1450));
        cars.add(carFactory.createCar("CHEVROLET", "Camry ", 2022, "", true, 590000, 1300));
    }

    public static  CarInventory getInstance() {
        if (instance == null) {
            instance = new CarInventory();
        }
        return instance;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}

