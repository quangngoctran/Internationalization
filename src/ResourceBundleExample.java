import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        // Set the default locale to English
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in "+ Locale.getDefault() + ": " + bundle.getString("greeting"));
        System.out.println(bundle.getString("answer"));

        // Change the default locale to VietnameseSystem.out.println(bundle.getString("answer"));
        Locale.setDefault(new Locale("vi", "VN"));
        bundle = ResourceBundle.getBundle("MessageBundle");
        System.out.println("Message in "+ Locale.getDefault() + ": " + bundle.getString("greeting"));
        System.out.println(bundle.getString("answer"));
    }
}
