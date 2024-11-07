package Clase_21;

import java.util.Scanner;

public class primeMethod {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        boolean isPrPrime;
        int prNum;
        do {
            System.out.print("Ingrese el número a verificar si es primo (para salir presiona 0): ");
            prNum = tSc.nextInt();
            tSc.nextLine();
            isPrPrime = isPrimeRecursive(prNum,(int)Math.sqrt(prNum));
            String msg = isPrPrime?"El número %d es primo. \n":"El número %d no es primo. \n";
            if (prNum!=0){
                System.out.printf(msg,prNum);
                System.out.print("Presiona enter para continuar: ");
                tSc.nextLine();
            }
            System.out.print("\033\143");
        } while (prNum!=0 && !isPrPrime);
        System.out.println("Hasta pronto");
        tSc.close();
    }

    public static boolean isPrimeRecursive(int num,int i){
        return i<2?true:(!(num%i==0) && isPrimeRecursive(num, i-1));
    }
}
