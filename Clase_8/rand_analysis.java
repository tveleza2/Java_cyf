package Clase_8;

import java.util.Scanner;

public class rand_analysis {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingrese el límite inferior: ");
        int lowerLimit = tScan.nextInt();
        System.out.print("Ingrese el límite superior: ");
        int upperLimit = tScan.nextInt();
        int myRand = (int)(Math.floor((upperLimit-lowerLimit + 1) * Math.random())+lowerLimit);//kadcbkzdbkadbkdjbvsdkbvsdkbvdskbvkdjsbvkjdsbvkjsdbvksdbvsdkjvbdskjvsdkvjbsdkvjb
        System.out.printf("El número generado es: %d. \n", myRand);
        tScan.close();
    }
}
