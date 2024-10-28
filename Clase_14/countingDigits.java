package Clase_14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class countingDigits {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        System.out.print("Escriba una número: ");
        int countDigits = 0;
        try (Scanner tSc = new Scanner(System.in)){
            String myStr = tSc.nextLine();
            for(int i=0;i<myStr.length();i++){
                if(Character.isDigit(myStr.charAt(i))){
                    countDigits ++;
                }
            } 
            if(countDigits!=0){System.out.printf("El número contiene %d dígitos. \n",countDigits);
            }else{System.out.println("No ingresaste un número");}
            
        }catch (InputMismatchException e) {
            System.out.println("Debe escribir una cadena.");
        }
    }
}
