import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        // Set the default locale to English
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in "+ Locale.getDefault() + ": " + bundle.getString("greeting"));

        // Change the default locale to Vietnamese
        Locale.setDefault(new Locale("vi", "VN"));
        bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in "+ Locale.getDefault() + ": " + bundle.getString("greeting"));

    }
}
