package Clase_13;
/*Escribe un programa en Java que realice lo siguiente:

 - Solicita al usuario un tamaño para un arreglo.
 - Luego, pídele que ingrese un número con el que desea rellenar el array.
 - Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
 - El array deberá ser rellenado con el número proporcionado hasta el índice ingresado por el usuario.]*/
import java.util.Scanner;
import java.util.Arrays;

public class complementaryC13 {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el tamaño para el nuevo arreglo");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int num, idx, start_idx = 0;
        
        do {
            System.out.println("¿Con qué número entero quieres rellenarlo?");
            num = sc.nextInt();
            
            do {
                System.out.println("¿Hasta que índice?");
                idx = sc.nextInt();
            } while (idx < start_idx || idx >= arr.length);
            
            Arrays.fill(arr, start_idx, idx + 1, num);
            
            start_idx = idx;
            
            System.out.println("El nuevo arreglo es: " + Arrays.toString(arr));
        } while (idx < arr.length - 1);
        
        sc.close();
        }
}
