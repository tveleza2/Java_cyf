
package Clase_16;


import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        System.out.print("Ingrese un número en el sistema: ");
        int myInt = tSc.nextInt();
        int factorial = 1;
        int i = 0;
        if (myInt<0){
            System.err.println("El número no puede ser menor a 0");
        }else{
            do {
                i++;
                factorial = factorial*i;
            } while (i<myInt);
            System.out.printf("El factorial de %d es %d.\n",myInt,factorial);
        }
        tSc.close();
    }
}