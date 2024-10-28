package Clase_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class onlyLetters {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        System.out.print("Escriba una cadena: ");
        boolean onlyLetters = true;
        try (Scanner tSc = new Scanner(System.in)){
            String myStr = tSc.nextLine();
            for(int i=0;i<myStr.length();i++){
                if(!Character.isLetter(myStr.charAt(i))){
                    onlyLetters = false;
                    System.out.println("La cadena tiene caracteres que no son letras.");
                    break;
                }
            } 
            if(onlyLetters){
                System.out.println("La cadena solo contiene letras.");
            };
        }catch (InputMismatchException e) {
            System.out.println("Debe escribir una cadena");
        }
    }
}
