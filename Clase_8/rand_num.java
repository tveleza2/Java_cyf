package Clase_8;

import java.util.Scanner;

public class rand_num {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        int myRand = (int)Math.floor(355 * Math.random());
        System.out.printf("El número generado es: %d. \n", myRand);
        tScan.close();
    }
}
