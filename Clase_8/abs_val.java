package Clase_8;

import java.util.Scanner;

public class abs_val {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Introduce un número real: ");
        float myFloat = tScan.nextFloat();
        System.out.printf("El valor absoluto del número es: %f.\n", Math.abs(myFloat));
        tScan.close();
    }
}
