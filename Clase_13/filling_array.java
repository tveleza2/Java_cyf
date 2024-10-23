package Clase_13;

import java.util.Arrays;
import java.util.Scanner;

public class filling_array {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        try (Scanner scan = new Scanner(System.in)) {
        
        System.out.println("Indica el tamaño para el nuevo arreglo");
        int size = scan.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("¿Con qué número entero quieres rellenarlo?");
        int num = scan.nextInt();
        Arrays.fill(array, num);
        
        System.out.println("Tu arreglo es: " + Arrays.toString(array));
        
        } catch (Exception e) {
        System.out.println(e);
        }
        }
}
