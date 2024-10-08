package Clase_4;

import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        boolean running = true;
        Scanner myScan = new Scanner(System.in);
        while (running) {
            System.out.print("\033\143");
            System.out.print("Escriba un número a validar: ");
            float myNumber = myScan.nextFloat();
            String message;
            // Aquí iría la validación de divisibilidad
            if (myNumber%5 == 0){
                if (myNumber%3 == 0) {
                    message = "El número es divisible entre 3 y 5";
                }
                else{
                    message = "El número es divisible entre 5";
                }

            } else if (myNumber%3 == 0) {
                message = "El número es divisible entre 3";
            } else{
                message = "El número no es divisible ni por 3 ni por 5";
            }

            System.out.print("\033\143");
            System.out.println(message);
            System.out.println("¿Quieres continuar con otro número?");
            System.out.println("y. Yes");
            System.out.println("n. No");
            myScan.nextLine();
            running = myScan.nextLine().toLowerCase().equals("y");
        }
        System.out.print("\033\143");
        System.out.println("¡Hasta la próxima!");
        myScan.close();
    }
}
