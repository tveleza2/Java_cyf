package Clase_8;

import java.util.Scanner;

public class round_num {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Introduce un número decimal: ");
        float myFloat = tScan.nextFloat();
        System.out.printf("El valor absoluto del número es: %d.\n", Math.round(myFloat));
        tScan.close();
    }
}
