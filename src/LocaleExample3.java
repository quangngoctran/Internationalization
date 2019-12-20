import java.util.Locale;

public class LocaleExample3 {
    public static void main(String[] args) {
        Locale[] locales = { new Locale("en", "US"),
                             new Locale("es", "ES"),
                             new Locale("it", "IT"),
                             new Locale("vi", "VN")
                           };

        for (int i = 0; i < locales.length; i++) {
            System.out.println(locales[i].toString() + ": " + locales[i].getDisplayLanguage());
        }
    }
}
