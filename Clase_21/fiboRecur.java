package Clase_21;

import java.util.Scanner;
// import java.util.Arrays;

public class fiboRecur {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        System.out.print("Ingrese un número en el sistema: ");
        int myInt = tSc.nextInt();
        // int[] fiboN = new int[myInt];

        // for (int i = 1; i <= myInt; i++) {
        //     fiboN[i-1] = fibonacciRecursive(i);
        // }
        // System.out.printf("La secuencia de fibonacci hasta la posición %d es:\n %s.\n",myInt,Arrays.toString(fiboN));
        System.out.printf("La secuencia de fibonacci en la posición %d es: %d.\n",myInt,fibonacciRecursive(myInt));
        tSc.close();
    }

    public static int fibonacciRecursive(int pos){
        if(pos==0){return 0;}
        return pos<=1?1:fibonacciRecursive(pos-1)+fibonacciRecursive(pos-2);
    }
}
