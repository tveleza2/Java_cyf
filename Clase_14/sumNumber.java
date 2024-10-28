package Clase_14;

import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        System.out.print("Escriba un número entero: ");
        try (Scanner tSc = new Scanner(System.in)){
            String myStr = tSc.nextLine();
            int myInt = Integer.valueOf(myStr);
            System.out.print("Escriba un número decimal: ");
            myStr = tSc.nextLine();
            double myDbl = Double.valueOf(myStr); 
            System.out.printf("La suma de los dos números ingresados es: %.2f. \n",myDbl+myInt);
        }catch (NumberFormatException e) {
            System.out.println("Debe escribir números (use \".\" para los decimales).");
        }
    }
}
