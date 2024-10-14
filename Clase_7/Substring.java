package Clase_7;

import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingrese una frase: ");
        String myStr = tScan.nextLine();
        System.out.print(("Ahora introzuca los dos índices con los que quieres acotar la frase: "));
        int inIndex = tScan.nextInt();
        int finIndex = tScan.nextInt();
        System.out.printf("La cadena recortada es: '%s' . \n",myStr.substring(inIndex, finIndex));
        tScan.close();
    }
}
