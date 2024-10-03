package Clase_2;
import java.util.Scanner;
public class activity_1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String name = myScanner.nextLine();
        System.out.println("Escribe tu edad: ");
        int age = myScanner.nextInt();
        myScanner.close();
        System.out.print("Hola "+ name+", ");
        System.out.print("tienes "+ age + " años");
        
    }
}
