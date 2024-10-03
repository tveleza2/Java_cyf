package Clase_2;

import java.util.Scanner;

public class complementarioC2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Ingresa tu año de nacimiento: ");
        int bornYear = myScanner.nextInt();
        myScanner.nextLine();
        myScanner.close();
        int currentYear = 2024;
        int age = currentYear - bornYear;
        if (age>=18){
            System.out.println("Como eres mayor de edad (tienes "+age+" años), puedes ingresar.");
        } else{
            System.out.println("Lo sentimos, debes ser mayor de edad para ingresar (tienes "+age+" años).");
        }
    }
}
