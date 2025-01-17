package CarAgency;

public abstract class CarBuilder {
    protected String manufacturer;
    protected String model;
    protected int year;
    protected String type;
    protected boolean availability;
    protected double price;
    protected double rentprice;
    protected String fuelType;
    protected boolean hatchBag;


    public CarBuilder setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public CarBuilder setAvailability(boolean availability) {
        this.availability = availability;
        return this;
    }

    public CarBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public CarBuilder setRentprice(double rentprice) {
        this.rentprice = rentprice;
        return this;
    }
    public CarBuilder setFuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }
    public CarBuilder setHatchBag(boolean hatchBag) {
        this.hatchBag = hatchBag;
        return this; }

    public abstract Car build();
}
