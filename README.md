# Car Agency System

## Description
This project is a simple Java-based car agency system designed to demonstrate the use of **creational design patterns**. The system allows users to register as customers or log in as employees to manage car inventory. Customers can view, buy, or rent cars, while employees can add new cars to the inventory and view available cars.

## Features
- **Customer Features:**
  - View available cars.
  - Buy a car.
  - Rent a car.
- **Employee Features:**
  - Add new cars to the inventory.
  - View the list of available cars.
  - Protected by an access code for modifications.

## Design Patterns Used
### 1. Singleton Pattern
- **Classes:**
  - `CarInventory`: Ensures only one instance of the car inventory exists.
  - `ScannerSingleton`: Provides a single shared instance of the scanner for input.

### 2. Factory Pattern
- **Classes:**
  - `CarFactory`: Interface defining the creation of `Car` objects.
  - `CarFactoryImpl`: Implementation of the factory that creates different types of cars (`Sedan`, `SUV`, or generic).
- **Purpose:**
  - Simplifies object creation by encapsulating the logic for instantiating different car types.

### 3. Builder Pattern
- **Classes:**
  - `CarBuilder`: Abstract class defining the blueprint for building a car.
  - `ConcreteCarBuilder`: Concrete implementation of `CarBuilder` for creating cars step-by-step.
- **Purpose:**
  - Constructs complex objects (e.g., `Car` objects) using a step-by-step approach with fluent interfaces.

## How to Use
1. **Run the Application:** Execute the `Main` class to start the system.
2. **Select Your Role:** Choose to register as a customer or log in as an employee.
3. **Customer Options:**
   - View available cars.
   - Select to buy or rent a car.
4. **Employee Options:**
   - Enter the access code (default: `0000`) to make modifications.
   - Add new cars to the inventory or view the list of available cars.
5. **Exit:** Select the exit option to close the application.

## Technologies Used
- **Java**: The core programming language for implementation.

## Example Code Snippet
The following snippet demonstrates the main application loop:

```java
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
```

## Notes
- This project was created for learning purposes and to practice design pattern implementation in Java.
- The access code for employee actions is currently hardcoded as `0000`.

## Additional Examples
### Using Factory Pattern
```java
CarFactory carFactory = new CarFactoryImpl();
Car sedan = carFactory.createCar("Toyota", "Camry", 2022, "Sedan", true, 30000, 100);
Car suv = carFactory.createCar("Ford", "Explorer", 2023, "SUV", true, 50000, 150);
```

### Using Builder Pattern
```java
CarBuilder builder = new ConcreteCarBuilder();
Car customCar = builder.setManufacturer("BMW")
                       .setModel("X5")
                       .setYear(2022)
                       .setType("SUV")
                       .setAvailability(true)
                       .setPrice(60000)
                       .setRentprice(200)
                       .build();
```

