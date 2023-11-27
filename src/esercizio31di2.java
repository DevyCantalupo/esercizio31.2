import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class esercizio31di2 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String fecha = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(fecha);
    }
}