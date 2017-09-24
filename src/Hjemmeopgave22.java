import java.util.Scanner;
//This program computes the area and volume of an equilateral triangle
public class Hjemmeopgave22 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast sidelængde");

        double længde = input.nextDouble();
        double areal = (Math.sqrt(3)/4)*(Math.pow(længde,2));
        double volume = areal * længde;

        System.out.println(" ");
        System.out.println("For en ligesidet trekant med en sidelængde på " + længde + " er: ");
        System.out.println("Areal = " + areal);
        System.out.println("Volumen = " + volume);


   }
}
