package chatgpt.exemple;

public class Car extends Vehicle {
    private int numDoors;
    private String combustibleType;

    public Car(String brand, String model, int year, double price, int numDoors, String combustibleType) {
        super(brand, model, year, price);
        setNumDoors(numDoors);
        setCombustibleType(combustibleType);
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) throws IllegalArgumentException {
        if (numDoors < 0) throw new IllegalArgumentException(CustomErrors.G_INVALID_NUMBER);

        this.numDoors = numDoors;
    }

    public String getCombustibleType() {
        return combustibleType;
    }

    public void setCombustibleType(String combustibleType) throws IllegalArgumentException {
        if (combustibleType == null) {
            throw new IllegalArgumentException(CustomErrors.NULL_ARGUMENT);

        } else if (combustibleType.equalsIgnoreCase("Diesel") ||
                combustibleType.equalsIgnoreCase("Gasoil") ||
                combustibleType.equalsIgnoreCase("Electric")) {
            this.combustibleType = StringUtils.capitalizeFirstLetter(combustibleType);
        } else {
            throw new IllegalArgumentException(CustomErrors.INVALID_COMBUSTIBLE);
        }
    }
}