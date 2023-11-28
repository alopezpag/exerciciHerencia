package chatgpt.exemple;

public abstract class StringUtils {
    public static String formatString(String str) {
        String formattedString = str.trim();
        formattedString = formattedString.replaceAll("\\s+", " ");
        return formattedString;
    }

    public static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
