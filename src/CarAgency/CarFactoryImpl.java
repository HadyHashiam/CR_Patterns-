

package CarAgency;



public class CarFactoryImpl implements CarFactory {
    @Override
    public Car createCar(String manufacturer, String model, int year, String type, boolean availability, double price, double rentprice) {
        if (type.equalsIgnoreCase("Sedan")) {
            return SedanCar.getInstance(manufacturer, model, year, type, availability, price, rentprice , "Petrol-95");
        } else if (type.equalsIgnoreCase("SUV")) {
            return  SUVCar.getInstance(manufacturer, model, year, type, availability, price, rentprice,true);
        } else {
            return new CarImpl(manufacturer, model, year, type, availability, price, rentprice);        }
    }
}
