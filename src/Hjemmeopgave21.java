import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

//This program converts miles (input from console) into kilometres
public class Hjemmeopgave21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast miles");


        double miles = input.nextDouble();
        double kilometer = (1.6 * miles);

        System.out.println(miles + " miles = " + kilometer + " kilometer");

    }
}
