package CarAgency;

import java.util.ArrayList;

public class Empolyee extends Customer {
    public Empolyee(String name, String mail, String phone, double balance) {
        super(name, mail, phone, balance);
    }
    public void addCar(ArrayList<Car> cars) {
        CarFactory carFactory = new CarFactoryImpl();
        CarBuilder carBuilder = new ConcreteCarBuilder();

        System.out.println("You will add a new car");
        System.out.println("Enter the name of car manufacturer:");
        String manufacturer = ScannerSingleton.getInstance().next();
        System.out.println("Enter the car model:");
        String model = ScannerSingleton.getInstance().next();
        System.out.println("Enter car model year:");
        int year = ScannerSingleton.getInstance().nextInt();
        ScannerSingleton.getInstance().nextLine();
        System.out.println("Enter the car price:");
        double price = ScannerSingleton.getInstance().nextDouble();
        ScannerSingleton.getInstance().nextLine();
        System.out.println("Enter the car rent price:");
        double rentprice = ScannerSingleton.getInstance().nextDouble();
        ScannerSingleton.getInstance().nextLine();
        System.out.println("Enter car type:");
        String type = ScannerSingleton.getInstance().nextLine();
        Car car = carFactory.createCar(manufacturer, model, year, type, true, price, rentprice);
        Car carr = carBuilder.setManufacturer(manufacturer)
                .setModel(model)
                .setYear(year)
                .setType(type)
                .setAvailability(true)
                .setPrice(price)
                .setRentprice(rentprice)
                .build();
        cars.add(car);
        System.out.println("Car successfully added.");

    }


}

