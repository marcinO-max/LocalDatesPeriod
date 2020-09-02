import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Time {


    public static String passed(String odData, String doData) throws DateTimeException {
        LocalDateTime date1 = LocalDateTime.parse(odData);
        LocalDateTime date2 = LocalDateTime.parse(odData);
        if(odData.contains("T") || doData.contains("T")){
            String format = "d MMMM yyyy 'godz' HH:mm";
            String wartString1 = date1.format(DateTimeFormatter.ofPattern(format));
            String wartString2 = date2.format(DateTimeFormatter.ofPattern(format));
            System.out.println(wartString1 + " " + wartString2);
        }else{

        }




        return null;
    }
}
