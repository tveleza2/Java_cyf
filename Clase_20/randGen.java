package Clase_20;

import java.util.Scanner;

public class randGen {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.println("Ingrese el máximo y el mínimo del rango donde se generará el número");
        int min = tScan.nextInt();
        int max = tScan.nextInt();
        tScan.close();
        System.out.print(clear);
        System.out.printf("El número generado es: %d. \n", randNum(min, max));
    }

    public static int randNum(int min, int max) {
        return (int)Math.floor((max-min+1) * Math.random()+min);
    }
}
