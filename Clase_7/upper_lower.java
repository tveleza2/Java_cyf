package Clase_7;

import java.util.*;

public class upper_lower {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143"; //Cófigo ANSI
        System.out.print(clear);
        System.out.print("Ingrese una frase: ");
        String myStr = tScan.nextLine();
        System.out.println(("Seleccione cómo quiere ver la frase: \n 1. MAYÚSCULA \n 2. minúscula"));
        int option = tScan.nextInt(); // Esto me permite controlar si se ejecuta la linea 15 o 17
        if (option == 1){
            System.out.printf(myStr.toUpperCase()+"\n");
        } else if(option == 2){
            System.out.printf(myStr.toLowerCase()+"\n");
        } else{
            System.out.println("Opción inválida");
            // Los escucho bien!!!
        }
        tScan.close();   
    }
}
