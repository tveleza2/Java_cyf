package Clase_9;

import java.util.*;

public class tempConvertion {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        boolean valid = false;
        double myTemp = -1;
        double convertedTemp = -1;
        char unitOut = 'x';
        char unit = 'x';
        while (!valid) {
            System.out.print("Ingrese la temperatura: ");
            
            try {
                myTemp = tScan.nextFloat();
                tScan.nextLine();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print(clear);
                System.out.printf("Tipo de dato inválido: %s \n",e.getCause());
                tScan.next();
                continue;
            }
        }
        valid = false;
        while (!valid) {
            valid = true;
            System.out.print("Ingrese las unidades de medida de temperatura: ");
            unit = tScan.nextLine().toUpperCase().charAt(0);
            switch (unit) {
                case 'C':
                    unitOut = 'F';
                    convertedTemp = myTemp*(9/5)+32;
                    break;
                case 'F':
                    unitOut = 'C';
                    convertedTemp = (myTemp-32)*5/9;
                    break;
                default:
                    System.out.print(clear);
                    System.out.println("Unidad inválida, por favor ingrese C para celsius o F para farenheit.");
                    valid = false;
                    break;
            }
        }
        System.out.printf("La temperatura %f %c,equivale a %f %c. \n", myTemp,unit,convertedTemp,unitOut);
        tScan.close();
    }
}
