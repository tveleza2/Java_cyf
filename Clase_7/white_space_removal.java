package Clase_7;

import java.util.*;

// Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al principio y al final. Utiliza 
// el método trim() de la clase String para eliminar los espacios en blanco y luego muestra la frase resultante en pantalla.

public class white_space_removal {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingresa la frase a la que le quieres quitar los espacios en blanco marginales: ");
        String myStr = tScan.nextLine();
        System.out.println(myStr.trim());
        tScan.close();
    }
}
