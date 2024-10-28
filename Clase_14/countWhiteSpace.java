package Clase_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class countWhiteSpace {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        System.out.print("Escriba una cadena: ");
        int countWhiteSpace = 0;
        try (Scanner tSc = new Scanner(System.in)){
            String myStr = tSc.nextLine();
            for(int i=0;i<myStr.length();i++){
                if(Character.isWhitespace(myStr.charAt(i))){
                    countWhiteSpace ++;
                }
            } 
            System.out.printf("La cadena contiene %d espacios en blanco. \n",countWhiteSpace);
        }catch (InputMismatchException e) {
            System.out.println("Debe escribir una cadena.");
        }
    }
}
