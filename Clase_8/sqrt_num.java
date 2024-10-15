package Clase_8;

import java.util.Scanner;

public class sqrt_num {
    public static void main(String[] args) {
        Scanner tScan = new Scanner(System.in);
        String clear = "\033\143";
        System.out.print(clear);
        System.out.print("Ingrese el número a extraer la raíz: ");
        double myNum = tScan.nextDouble();
        double result = Math.sqrt(Math.abs(myNum));
        String result_str = myNum<0? Double.toString(result)+"i": Double.toString(result);
        System.out.printf("El resultado de sacar raíz a %f es: %s. \n", myNum,result_str);
        tScan.close();
    }
}
