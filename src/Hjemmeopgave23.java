import java.util.Scanner;

public class Hjemmeopgave23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast meter for at konvertere:");

        double meter = input.nextDouble(); //input fra console
        double feet = 3.2786; // 1 meter = 3,2786 fod
        double resultat = (meter * feet); //beregner input fra console * fast variabel for fod 3,2786

        System.out.println( meter + " meter = " + resultat + " fod ");

    }
}
