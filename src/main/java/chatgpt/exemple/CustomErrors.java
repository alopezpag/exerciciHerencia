package chatgpt.exemple;

public final class CustomErrors {
    public static final String NULL_ARGUMENT = "Parameter can not be null.";
    public static final String EMPTY_ARGUMENT = "Parameter can not be empty.";
    public static final String INVALID_YEAR_NUMBER = "Year can not be '< 1889' or '> 2023'.";
    public static final String INVALID_PRICE = "Price can not be less than '0'.";
    public static final String G_INVALID_NUMBER = "Number can not be less than '0'.";
    public static final String INVALID_COMBUSTIBLE = "String must be 'Diesel', 'Gasoil' or 'Electric'.";

    // Private constructor to avoid class instantiation
    private CustomErrors() {
    }
}