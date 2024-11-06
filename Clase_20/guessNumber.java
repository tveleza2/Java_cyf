package Clase_20;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el número mínimo y máximo del rango donde desea jugar: ");
        int min = scan.nextInt();
        int max = scan.nextInt();
        int hiddenNumber = randNum(min, max);
        int guessNumber;
        System.out.print(clear);
        do {
            System.out.println("El número es: "+hiddenNumber);
            System.out.print("Intenta adivinar el número aleatorio: ");
            guessNumber = scan.nextInt();
            if(guessNumber>hiddenNumber){
                System.out.print(clear);
                System.out.println("El número ingresado es mayor al número generado.");
            }else if(guessNumber<hiddenNumber){
                System.out.print(clear);
                System.out.println("El número ingresado es menor al número generado.");
            }
        } while (guessNumber !=hiddenNumber);
        scan.close();
        System.out.print(clear);
        System.out.printf("Felicidades, adivinaste, el número generado es %d. \n",hiddenNumber);
    }
    public static int randNum(int min, int max) {
        return (int)Math.floor((max-min+1) * Math.random()+min);
    }
}
