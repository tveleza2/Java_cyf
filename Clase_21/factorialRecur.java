package Clase_21;

import java.util.Scanner;

public class factorialRecur {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        System.out.print("Ingrese un número en el sistema: ");
        int myInt = tSc.nextInt();
        if (myInt<0){
            System.err.println("El número no puede ser menor a 0");
        }else{
            System.out.printf("El factorial de %d es %d.\n",myInt,factorialRecursive(myInt));
        }
        tSc.close();
    }

    public static int factorialRecursive(int num){
        return num<=1?1:num*factorialRecursive(num-1);
    }
}
