package Clase_4;
import java.util.Scanner;


// En esta actividad, deberás escribir un programa que solicite al usuario un número
//  y determine si es positivo, negativo o cero. El resultado se mostrará en pantalla.
public class number_classification {
    public static void main(String[] args) {
        System.out.print("\033\143");
        Scanner myScan = new Scanner(System.in);
        System.out.print("Escriba un número a validar: ");
        float myNumber = myScan.nextFloat();
        if (myNumber>0) {
            System.out.println("El número es positivo");
        }else if (myNumber<0) {
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número es 0");
        }
        myScan.close();
    }
}
