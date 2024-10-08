package Clase_4;
import java.util.Scanner;

public class complementarioC4 {
    public static void main(String[] args) {
        boolean running = true;
        Scanner myScan = new Scanner(System.in);
        while (running) {
            System.out.print("\033\143");
            System.out.print("Introduzca su contraseña: ");
            final String MYPASSWORD = "contra";
            String password = myScan.nextLine();
            // Aquí iría la validación de divisibilidad
            if (password.equals(MYPASSWORD)){
                System.out.println("Bienvenido user");
                System.out.println("¿Quieres quedarte en el sistema?");
                System.out.println("y. Yes");
                System.out.println("n. No");
            } else{
                System.out.println("Contraseña incorrecta");
                System.out.println("¿Quieres intentar nuevamente?");
                System.out.println("y. Yes");
                System.out.println("n. No");
            }

            
            running = myScan.nextLine().toLowerCase().equals("y");
        }
        System.out.print("\033\143");
        System.out.println("¡Hasta la próxima!");
        myScan.close();
    }
}
