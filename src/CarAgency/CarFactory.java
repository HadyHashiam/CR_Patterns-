package CarAgency;

public interface CarFactory {
    Car createCar(String manufacturer, String model, int year, String type,
                  boolean availability, double price, double rentprice);
}
