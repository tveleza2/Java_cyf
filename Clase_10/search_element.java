package Clase_10;
import java.util.Scanner;

public class search_element {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        int[] numeros = {5, 10, 15};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int nroIngresado = scanner.nextInt();

        if (nroIngresado == numeros[0] || nroIngresado == numeros[1] || nroIngresado == numeros[2]) {
        System.out.println("El número está presente en el array.");
        } else {
        System.out.println("El número no está presente en el array.");
        }

        scanner.close();
    }
}
