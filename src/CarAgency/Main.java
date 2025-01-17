package CarAgency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarInventory carInventory = CarInventory.getInstance();
        Scanner scanner = ScannerSingleton.getInstance();

        System.out.println("Welcome to Car Agency System ");
        while (true) {
            System.out.println("1. Register as customer");
            System.out.println("2. Login as employee");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Customer customer = new Customer("random person", "randomc@gmail.com", "999-999", 0);
                    System.out.println("1- Show the cars");
                    System.out.println("2- Buy a car");
                    System.out.println("3- Rent a car");

                    int cho = scanner.nextInt();
                    switch (cho) {
                        case 1:
                            customer.showAvailableCars(carInventory.getCars());
                            break;
                        case 2:
                            customer.buyCar(carInventory.getCars());
                            break;
                        case 3:
                            customer.rentCar(carInventory.getCars());
                            break;
                    }
                    break;

                case 2:
                    Empolyee employee = new Empolyee("random employee", "randome@gmail.com", "555-1234", 0);

                    System.out.println("Enter the employee access code to modify");
                    int scan1 = scanner.nextInt();
                    if (scan1 == 0000) {
                        System.out.println("1 - Add car");
                        System.out.println("2 - Show cars");
                        int scan12 = scanner.nextInt();

                        switch (scan12) {
                            case 1:
                                employee.addCar(carInventory.getCars());
                                break;
                            case 2:
                                System.out.println("Available cars:");
                                employee.showAvailableCars(carInventory.getCars());
                                break;
                        }
                    } else {
                        System.out.println("Invalid code.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Car Agency System.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("........................." + "\n");
        }
    }
}
