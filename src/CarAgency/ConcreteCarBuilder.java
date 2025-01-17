
package CarAgency;

public class ConcreteCarBuilder extends CarBuilder {
    @Override
    public Car build() {
        if (type.equalsIgnoreCase("Sedan")) {
            return SedanCar.getInstance(manufacturer, model, year, type, availability, price, rentprice , "Petrol-95");
        } else if (type.equalsIgnoreCase("SUV")) {
            return  SUVCar.getInstance(manufacturer, model, year, type, availability, price, rentprice, true);
        }
        else {
            return new CarImpl(manufacturer, model, year, type, availability, price, rentprice);

        }
    }
}

