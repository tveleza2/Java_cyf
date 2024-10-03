package Clase_2;

import java.util.Scanner;

public class activity_operator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Escriba dos números: ");
        Double x = myScanner.nextDouble();
        Double y = myScanner.nextDouble();
        System.out.println("La suma x+y da "+ (x+y));
        System.out.println("La resta x-y da "+ (x-y));
        System.out.println("La multiplicación x*y da "+ (x*y));
        System.out.println("La división x/y da "+ (x/y));
        System.out.println("El residuo de la división x/y da "+ (x%y));
        myScanner.close();
    }
}
