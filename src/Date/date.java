
package Date;
import java.util.Date;
/**
 * Created by Pavilion on 15-4-2016.
 */
public class date {
    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();
        String str = String.format("Current Date/Time : %tc", date );
        System.out.printf(str);
        System.out.println (date.getTime());
        // display time and date using toString()
        System.out.println(date.toString());
        System.out.println(date.toLocaleString());
    }
}
