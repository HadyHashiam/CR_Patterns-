package CarAgency;

public interface Car {
    String getManufacturer();
    void setManufacturer(String manufacturer);
    String getModel();
    void setModel(String model);
    int getYear();
    void setYear(int year);
    String getType();
    void setType(String type);
    boolean getAvailability();
    void setAvailability(boolean availability);
    double getPrice();
    void setPrice(double price);
    double getRentprice();
    void setRentprice(double rentprice);

    String getFuelType();
    boolean getHatchBag();
}
