package Clase_7;
import java.util.*;
public class string_length {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingrese una cadena de caracteres: ");
        String myStr = tScan.nextLine();
        System.out.printf("El número de caracteres que tiene la cadena ingresada es: %d. \n",myStr.length());
        tScan.close();
    }
}
