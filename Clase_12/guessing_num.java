package Clase_12;

import java.util.Scanner;

public class guessing_num {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        int num = (int)(1+ Math.random()*20);
        int guess;
        System.out.println("Adivina el número");
        do {
            guess = tScan.nextInt();
        } while (guess!=num);
        System.out.println("Felicidades, adivinaste el número.");
        tScan.close();
    }
}
