package CarAgency;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    private double balance;
    private Scanner scanner;

    public Customer() {
        scanner = ScannerSingleton.getInstance();
    }

    public Customer(String name, String mail, String phone, double balance) {
        super(name, mail, phone);
        this.balance = balance;
        this.scanner = ScannerSingleton.getInstance();
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void showAvailableCars(ArrayList<Car> cars) {
        System.out.println("Available cars:");
        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            System.out.print(i + 1 + "- " + car.getManufacturer() + " - " + car.getModel() + "." + car.getYear() + " - type of car : " + car.getType() + " -- Availability is = " + car.getAvailability());

            if (car instanceof SedanCar) {
                SedanCar sedan = (SedanCar) car;
                System.out.print(" - Fuel_Type: " + sedan.getFuelType());
            } else if (car instanceof SUVCar) {
                SUVCar suv = (SUVCar) car;
                System.out.print(" - Hatch_Bag: " + suv.getHatchBag());
            }
            System.out.println();
        }
    }


    public void rentCar(ArrayList<Car> cars) {
        for (int q = 0; q < cars.size(); q++) {
            Car car = cars.get(q);
            System.out.println(q + 1 + " - " + car.getManufacturer() + " " + car.getYear() + " " + car.getRentprice());
        }

        System.out.println("Which car would you like to rent?");
        int ww = scanner.nextInt();
        System.out.println(cars.get(ww - 1).getManufacturer() + " " + cars.get(ww - 1).getYear());
        System.out.println("Availability: " + cars.get(ww - 1).getAvailability());
        System.out.println("The rental price: " + cars.get(ww - 1).getRentprice());
        System.out.print("Enter your balance: ");
        double s5 = scanner.nextDouble();
        setBalance(s5);

        if (cars.get(ww - 1).getAvailability() && balance >= cars.get(ww - 1).getRentprice()) {
            System.out.println("Successfully rented the car.");
            balance -= cars.get(ww - 1).getRentprice();
            System.out.println("Your balance is: " + balance);
            cars.get(ww - 1).setAvailability(false);
        } else {
            System.out.println("Car is not available or insufficient balance.");
        }
    }

    public void buyCar(ArrayList<Car> cars) {
        for (int y = 0; y < cars.size(); y++) {
            Car car = cars.get(y);
            System.out.println(y + 1 + " - " + car.getManufacturer() + " " + car.getYear());
        }
        System.out.println("Which car would you like to buy?");
        int num = scanner.nextInt();
        System.out.println(cars.get(num - 1).getManufacturer() + " " + cars.get(num - 1).getYear());

        System.out.println("The price is: " + cars.get(num - 1).getPrice() + " $");
        System.out.println("Availability: " + cars.get(num - 1).getAvailability());
        System.out.print("Enter your balance: ");
        double ss = scanner.nextDouble();
        setBalance(ss);
        System.out.println("Your balance is: " + getBalance());
        System.out.println("The car price is: " + cars.get(num - 1).getPrice());

        if (cars.get(num - 1).getAvailability() && balance >= cars.get(num - 1).getPrice()) {
            System.out.println("Successfully purchased the car.");
            balance -= cars.get(num - 1).getPrice();
            System.out.println("Your balance is: " + balance);
            cars.get(num - 1).setAvailability(false);
        } else {
            System.out.println("Insufficient balance or car isn't available.");
        }
    }
}
