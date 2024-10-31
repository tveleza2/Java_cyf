package Clase_16;

import java.util.Scanner;

public class barChart2 {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        System.out.print("Ingresa los cuatro datos: ");
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            do {
                numbers[i] = tSc.nextInt();
                if(numbers[i]<1 || numbers[i]>20){
                    System.out.print("\033\143"); // Limpia la consola
                    System.out.println("El número debe estar entre 1 y 20");
                }
            } while (numbers[i]<1 || numbers[i]>20);
        }
        tSc.close();
        
        System.out.print("\033\143"); // Limpia la consola
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j]+" ");
            for (int i = 0; i < numbers[j]; i++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        

    }
}
