package Clase_7;

import java.util.*;

public class Char_search {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingrese una frase: ");
        String myStr = tScan.nextLine();
        System.out.print(("Ahora introzuca el caracter que desea buscar: "));
        char letter = tScan.next().charAt(0);
        int indexOfChar = myStr.indexOf(letter);
        if (indexOfChar !=-1){
            System.out.printf("La posicion del caracter '%c'en la cadena es: %d. \n",letter,indexOfChar);
        } else{
            System.out.printf("El caracter '%c' no se encuentra en la cadena. \n",letter);
        }
        tScan.close();    
    }
}
