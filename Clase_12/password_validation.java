package Clase_12;

import java.util.Scanner;

public class password_validation {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner scanner = new Scanner(System.in);
        String contrasenaCorrecta = "secreto";

        System.out.println("Ingresa la contraseña:");

        String contrasenaIngresada = scanner.nextLine();
        while (!contrasenaIngresada.equals(contrasenaCorrecta)) {
            System.out.print(clear);
            System.out.println("Contraseña incorrecta, inténtalo de nuevo:");
            contrasenaIngresada = scanner.nextLine();
        }
        System.out.print(clear);
        System.out.println("Contraseña correcta. Acceso concedido.");
        scanner.close();
    }
}
