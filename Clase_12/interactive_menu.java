package Clase_12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class interactive_menu {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String clear = "\033\143";
        System.out.print(clear);
        try {
        int opcion = 0;

        while(opcion != 5){
            // System.out.print(clear);
            System.out.println("Ingrese una opción: ");
            System.out.println("1- Comprar producto.");
            System.out.println("2- Realizar devolución.");
            System.out.println("3- Ver mis pedidos.");
            System.out.println("4- Preguntas frecuentes.");
            System.out.println("5- Salir.");
            opcion = scan.nextInt();

            String mensaje = switch(opcion){
            case 1 -> "Comprar producto.";
            case 2 -> "Realizar devolución.";
            case 3 -> "Ver mis pedidos.";
            case 4 -> "Preguntas frecuentes.";
            case 5 -> "Usted salió del sistema.";
            default -> "Ingrese una opción válida.";
            };

            System.out.println("");
            System.out.println(mensaje);
            System.out.println("");
        };


        } catch (InputMismatchException e) {
        System.out.println("No ingresó un número.");
        }


        scan.close();
    }
}
