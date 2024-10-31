package Clase_16;

import java.util.Scanner;
import java.util.Arrays;

public class primePlus {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        System.out.print("Ingrese el número de primos que desea: ");
        final int prNum = tSc.nextInt();
        int[] primeNumbers = new int[prNum];
        for (int i = 0; i < primeNumbers.length; i++) {
            if(i == 0){primeNumbers[i]=1;
                continue;}
            if(i == 1){primeNumbers[i]=2;
                continue;}
            if(i == 2){primeNumbers[i]=3;
                continue;}
            int initialPrime = primeNumbers[i-1];
            int newPrime = initialPrime + 2;
            boolean isPrime = false;
            while (!isPrime) {
                for (int j : primeNumbers) {
                    if(j==1){continue;}
                    // if(j>=(int)Math.sqrt(newPrime)){break;}
                    if(j==primeNumbers[i]){
                        primeNumbers[i] = newPrime;
                        isPrime=true;
                        break;
                    }   
                    if(newPrime%j==0){
                        newPrime+=2;
                        isPrime=false;
                        break;
                    }
                }
            }
        }
        System.out.printf("%s\n",Arrays.toString(primeNumbers));
        tSc.close();
    }
}
