package CarAgency;

public class CarImpl implements Car {
    private String manufacturer;
    private String model;
    private int year;
    private String type;
    private boolean availability;
    private double price;
    private double rentprice;

    public CarImpl(String manufacturer, String model, int year, String type, boolean availability, double price, double rentprice) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.type = type;
        this.availability = availability;
        this.price = price;
        this.rentprice = rentprice;
    }

    @Override
    public String getManufacturer() { return manufacturer; }
    @Override
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }
    @Override
    public String getModel() { return model; }
    @Override
    public void setModel(String model) { this.model = model; }
    @Override
    public int getYear() { return year; }
    @Override
    public void setYear(int year) { this.year = year; }
    @Override
    public String getType() { return type; }
    @Override
    public void setType(String type) { this.type = type; }
    @Override
    public boolean getAvailability() { return availability; }
    @Override
    public void setAvailability(boolean availability) { this.availability = availability; }
    @Override
    public double getPrice() { return price; }
    @Override
    public void setPrice(double price) { this.price = price; }
    @Override
    public double getRentprice() { return rentprice; }
    @Override
    public void setRentprice(double rentprice) { this.rentprice = rentprice; }
    @Override
    public String getFuelType() { return "Not Applicable"; }
    @Override
    public boolean getHatchBag() { return false; }
}