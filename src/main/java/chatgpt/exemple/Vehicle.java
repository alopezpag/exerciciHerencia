package chatgpt.exemple;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double price;

    protected Vehicle(String brand, String model, int year, double price) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) throws IllegalArgumentException {
        if (brand == null) {
            throw new IllegalArgumentException(CustomErrors.NULL_ARGUMENT);
        } else if (brand.isEmpty()) {
            throw new IllegalArgumentException(CustomErrors.EMPTY_ARGUMENT);
        }

        this.brand = StringUtils.formatString(brand);
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (model == null) {
            throw new IllegalArgumentException(CustomErrors.NULL_ARGUMENT);
        } else if (model.isEmpty()) {
            throw new IllegalArgumentException(CustomErrors.EMPTY_ARGUMENT);
        }

        this.model = StringUtils.formatString(model);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1886 || year > 2023) {
            throw new IllegalArgumentException(CustomErrors.INVALID_YEAR_NUMBER);
        }

        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException(CustomErrors.INVALID_PRICE);
        }

        this.price = price;
    }
}
