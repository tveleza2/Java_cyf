package Clase_4;
import java.util.Scanner;


// En este ejercicio de calificación, tu tarea es escribir un programa que solicite al usuario ingresar
// un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación 
public class control_structures {
    public static void main(String[] args) {
        boolean running = true;
        Scanner myScan = new Scanner(System.in);
        while (running) {
            System.out.print("\033\143");
            System.out.println("Bienvenido a tu traductor de notas");
            char califOut = 'I';
            boolean valid = false;
            while (!valid) {
                System.out.print("Escriba la calificación a asignar: ");
                float myCalif = myScan.nextFloat();
                valid = true;
                if (myCalif>=90 & myCalif<=100) {
                    califOut = 'A';
                }
                else if (myCalif>=80 & myCalif<90) {
                    califOut = 'B';
                }
                else if (myCalif>=70 & myCalif<80) {
                    califOut = 'C';
                }
                else if (myCalif>=60 & myCalif<70) {
                    califOut = 'D';
                }
                else if (myCalif>=0 & myCalif<60) {
                    califOut = 'F';
                }
                else{
                    System.out.print("\033\143");
                    System.out.println("La calificación no está en el rango válido [0,100]");
                    valid = false;
                }
            }
            System.out.print("\033\143");
            System.err.println("La calificación es: "+califOut);
            System.out.println("¿Quieres continuar con otra calificación?");
            System.out.println("y. Yes");
            System.out.println("n. No");
            myScan.nextLine();
            String ans = myScan.nextLine();
            if (ans.toLowerCase().equals("y")){
                running = true;
            };
        }
        System.out.print("\033\143");
        System.out.println("¡Hasta la próxima!");
        myScan.close();
    }
}
