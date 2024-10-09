package Clase_5;

import java.util.Scanner;

public class Opc_selector {
    public static void main(String[] args){
        boolean running = true;
        Scanner myScan = new Scanner(System.in);
        final String CLEAR = "\033\143";
        while (running) {
            
            System.out.print(CLEAR);
            System.out.println("Bienvenido a tu selector de opciones");
            boolean valid = false;
            String message = "Init";
            while (!valid) {
                System.out.println("¿Cuál opción desea elegir?: \n1. Guardar \n2. Cargar \n3. Salir");
                int option = myScan.nextInt();
                valid = true;
                message = switch (option){
                    case 1 -> "GUARDAR";
                    case 2 -> "CARGAR";
                    case 3 -> {
                        running = false;
                        yield "SALIR";}
                    default ->{
                        System.out.print("\033\143");
                        System.out.println("La calificación opción ingresada no es válida.");
                        valid = false;
                        yield "Error";}
                };
                
            }
            System.out.print("\033\143");
            System.err.println("La opción seleccionada es: " + message);
            System.out.print("Presione ENTER para continuar");
            myScan.nextLine();
            myScan.nextLine();
        }
        System.out.print("\033\143");
        System.out.println("¡Hasta la próxima!");
        myScan.close();
    }
}
