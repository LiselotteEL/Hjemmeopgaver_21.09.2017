import java.util.Scanner;

public class Hjemmeopgave211 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println( "Indtast antal år: ");
        int years = input.nextInt();


        long peopleCurrent = 312032486; //tal fra exercise 1.11, Introduction to Java Programming, 10th edition - by Y Daniel Liang.
        int birthsPerYear = (31536000 / 7); //antal sekunder på 1 år + tal fra exercise 1.11, Introduction to Java Programming, 10th edition - by Y Daniel Liang.
        int deathsPerYear = (31536000 / 13); //antal sekunder på 1 år + tal fra exercise 1.11, Introduction to Java Programming, 10th edition - by Y Daniel Liang.
        int immigrantsPerYear = (31536000 / 45); //antal sekunder på 1 år + tal fra exercise 1.11, Introduction to Java Programming, 10th edition - by Y Daniel Liang.

        long peopleIncrease = ((birthsPerYear + immigrantsPerYear)-deathsPerYear);
        long population = (peopleCurrent + (peopleIncrease * years));

        System.out.println("Populationen vil om " + years + " år være " + population );

    }
}
