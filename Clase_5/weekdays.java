package Clase_5;
import java.util.Scanner;

public class weekdays {
    public static void main(String[] args){
        System.out.print("\033\143");
        Scanner tScan = new Scanner(System.in);
        System.out.print("Introduzca un número del 1 al 7: ");
        int day = tScan.nextInt();
        tScan.nextLine();
        switch (day) {
            case 1: System.out.println("LUNES");
                break;
            case 2: System.out.println("MARTES");
                break;
            case 3: System.out.println("MIERCOLES");
                break;
            case 4: System.out.println("JUEVES");
                break;
            case 5: System.out.println("VIERNES");
                break;
            case 6: System.out.println("SABADO");
                break;
            case 7: System.out.println("DOMINGO");
                break;
            default: System.out.println("No es un número válido.");
                break;
        }
        tScan.close();
    }
}
