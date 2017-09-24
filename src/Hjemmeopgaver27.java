import java.util.Scanner;

public class Hjemmeopgaver27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast minutter: ");

        int antalMinutter = input.nextInt();

        int år = ((((antalMinutter / 60) / 24) / 365));
        int dage = (år % 365);

        System.out.println(antalMinutter + " minutter svarer til ca. " +år + " år og " + dage + " dage " );

    }
}