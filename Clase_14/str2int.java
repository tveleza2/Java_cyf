package Clase_14;

import java.util.Scanner;

public class str2int {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        System.out.print("Escriba un número entero: ");
        try (Scanner tSc = new Scanner(System.in)){
            String myStr = tSc.nextLine();
            int myInt = Integer.valueOf(myStr); 
            System.out.printf("El número ingresado es: %d. \n",myInt);
        }catch (NumberFormatException e) {
            System.out.println("Debe escribir un número.");
        }
    }
}
