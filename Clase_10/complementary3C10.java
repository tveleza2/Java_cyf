package Clase_10;
import java.util.Scanner;
import java.util.Arrays;

// Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados alfabéticamente y posteriormente impresos en la consola. Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento.

public class complementary3C10 {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner scanner = new Scanner(System.in);

        String array[] = new String[4];
        // Solicitar los 4 nombres
        System.out.print("Ingresa el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingresa el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        System.out.print("Ingresa el tercer nombre: ");
        String nombre3 = scanner.nextLine();

        System.out.print("Ingresa el cuarto nombre: ");
        String nombre4 = scanner.nextLine();

        // Comparaciones manuales para ordenar
        String primero, segundo, tercero, cuarto;

        // Comparar los primeros dos nombres
        if (nombre1.compareTo(nombre2) < 0) {
        primero = nombre1;
        segundo = nombre2;
        } else {
        primero = nombre2;
        segundo = nombre1;
        }

        // Comparar los siguientes dos nombres
        if (nombre3.compareTo(nombre4) < 0) {
        tercero = nombre3;
        cuarto = nombre4;
        } else {
        tercero = nombre4;
        cuarto = nombre3;
        }
        array[0] = nombre1;
        array[1] = nombre2;
        array[2] = nombre3;
        array[3] = nombre4;
        Arrays.sort(array);

        System.out.println("----------------");
        System.out.println("El array ordenado es : " + Arrays.toString(array));
        System.out.println("----------------");



        // Comparación final para ordenar los cuatro nombres
        if (primero.compareTo(tercero) < 0) {
        if (segundo.compareTo(tercero) < 0) {
        System.out.println("Nombres ordenados: " + primero + ", " + segundo + ", " + tercero + ", " + cuarto);
        } else if (segundo.compareTo(cuarto) < 0) {
        System.out.println("Nombres ordenados: " + primero + ", " + tercero + ", " + segundo + ", " + cuarto);
        } else {
        System.out.println("Nombres ordenados: " + primero + ", " + tercero + ", " + cuarto + ", " + segundo);
        }
        } else {
        if (cuarto.compareTo(primero) < 0) {
        System.out.println("Nombres ordenados: " + tercero + ", " + cuarto + ", " + primero + ", " + segundo);
        } else {
        System.out.println("Nombres ordenados: " + tercero + ", " + primero + ", " + cuarto + ", " + segundo);
        }
        }

        scanner.close();
    }
}
