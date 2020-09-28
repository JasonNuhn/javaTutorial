import java.util.*;
import java.text.*;

public class DateDemo {
    // public static void main(String args[]) {
    //     Date date = new Date();

    //     System.out.println(date.toString());
    // }

    // public static void main(String args[]) {
    //     Date dNow = new Date( );
    //     SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

    //     System.out.println("Current Date: " + ft.format(dNow));
    // }

    // public static void main(String args[]) {
    //     Date date = new Date();

    //     String str = String.format("Current Date/Time: %tc", date );

    //     System.out.printf(str);
    // }

    // public static void main(String args[]) {
    //     Date date = new Date();

    //     System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
    // }

    public static void main(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];

        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.println(t);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    };
}
