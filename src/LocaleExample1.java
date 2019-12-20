import java.util.Locale;

public class LocaleExample1 {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();

        System.out.println("Display country: " + locale.getDisplayCountry());
        System.out.println("Display language: " + locale.getDisplayLanguage());
        System.out.println("Display name: " + locale.getDisplayName());
        System.out.println("ISO3 country: " + locale.getISO3Country());
        System.out.println("ISO3 language: " + locale.getISO3Language());
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());
    }
}
