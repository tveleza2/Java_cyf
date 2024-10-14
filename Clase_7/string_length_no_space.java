package Clase_7;

import java.util.Scanner;

// En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, pero esta vez sin contar los espacios en blanco.
// Para lograr esto, se utilizará el método length() de la clase String y se realizará un proceso adicional para excluir los espacios de la cuenta.

public class string_length_no_space {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingrese una cadena de caracteres: ");
        String myStr = tScan.nextLine();
        int len = myStr.length();
        myStr = myStr.replaceAll("\\s","");
        System.out.printf("El número de caracteres que tiene la cadena ingresada es: %d. \nEl número de caracteres luego de quitar los espcacios es: %d. \n",len,myStr.length());
        tScan.close();
    }
}
