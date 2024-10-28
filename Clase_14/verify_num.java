package Clase_14;

import java.util.Scanner;

public class verify_num {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        System.out.print("Escriba un número: ");
        try (Scanner tSc = new Scanner(System.in)){
            String myStr = tSc.nextLine();
            double myDbl = Double.valueOf(myStr); 
            System.out.printf("El número ingresado es: %.2f. \n",myDbl);
        }catch (NumberFormatException e) {
            System.out.println("Debe escribir un número (use \".\" para los decimales).");
        }
    }
}
    