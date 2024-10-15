package Clase_8;

import java.util.Scanner;

public class pow_num {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingrese la base de la potencia: ");
        double myBase = tScan.nextDouble();
        System.out.print("Ingrese la base de la potencia: ");
        double myExp = tScan.nextDouble();
        double result = Math.pow(myBase, myExp);
        System.out.printf("El resultado de elevar %f a la potencia %f es: %f. \n", myBase,myExp,result);
        tScan.close();
    }
}
