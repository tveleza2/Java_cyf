package Clase_5;
import java.util.Scanner;

public class calif_conversion {
    public static void main(String[] args){
        boolean running = true;
        Scanner myScan = new Scanner(System.in);
        while (running) {
            running = false;
            String califOut = "NA";
            System.out.print("\033\143");
            System.out.println("Bienvenido a tu traductor de notas");
            boolean valid = false;
            while (!valid) {
                System.out.print("Escriba la calificación a asignar: ");
                int myCalif = myScan.nextInt();
                valid = true;
                califOut = switch (myCalif){
                    case 1 -> "Muy deficiente";
                    case 2 -> "Deficiente";
                    case 3 -> "Suficiente";
                    case 4 -> "Notable";
                    case 5 -> "Sobresaliente";
                    default ->{
                        System.out.print("\033\143");
                        System.out.println("La calificación ingresada no es válida.");
                        valid = false;
                        yield "NA";}
                };
                
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
