package Clase_6;
import java.util.*;

public class str2int {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        try {
        System.out.print("Ingrese el número entero: ");
        String cadenaDeNumero = tScan.nextLine();
        int num = Integer.parseInt(cadenaDeNumero);        
        System.out.println("El entero es "+num);
        }catch (NumberFormatException e) {
            System.out.print("Error de formato, no se puede convertir a entero "+e.getMessage());
            // e.printStackTrace();
        }
        tScan.close();
    }
}
