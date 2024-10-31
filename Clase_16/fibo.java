package Clase_16;

import java.util.Scanner;
// import java.util.Arrays;

public class fibo {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        System.out.print("Ingrese un número en el sistema: ");
        int myInt = tSc.nextInt();
        int[] fiboN = new int[myInt+1];

        for (int i = 0; i <= myInt; i++) {
            fiboN[i] = i==0?0:i==1?1:fiboN[i-1]+fiboN[i-2];
        }
        // System.out.printf("La secuencia de fibonacci hasta la posición %d es:\n %s.\n",myInt,Arrays.toString(fiboN));
        System.out.printf("La secuencia de fibonacci hasta la posición %d es: %d.\n",myInt,fiboN[myInt]);
        tSc.close();
    }
}
