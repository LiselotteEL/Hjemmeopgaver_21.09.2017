import java.util.Scanner;

public class Hjemmeopgaver28 {
    public static void main(String[] args) {

                // Obtain the total milliseconds since the midnight, Jan 1, 1970
                long totalMilliseconds = System.currentTimeMillis();


                // Obtain the total seconds since the midnight, Jan 1, 1970
                long totalSeconds = totalMilliseconds / 1000;


                // Compute the current second in the minute in the hour
                long currentSecond = totalSeconds % 60;


                // Obtain the total minutes
                long totalMinutes = totalSeconds / 60;


                // Compute the current minute in the hour
                long currentMinute = totalMinutes % 60;

                // Obtain the total hours
                long totalHours = totalMinutes / 60;


                // Compute the current hour
                long currentHour = totalHours % 24;

                //Input fra console
                Scanner input = new Scanner(System.in);


                System.out.println("Indtast tidsforskel:");


                //Variabel for forskellen i tidszoner
                int forskel = input.nextInt();


                System.out.println("Nuværende tid " + (currentHour + forskel) + ":"

                        + currentMinute + ":" + currentSecond);
    }
}
