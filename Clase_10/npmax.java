package Clase_10;
import java.util.Scanner;

public class npmax {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        System.out.println("Ingrese los números:");
        Scanner tScan = new Scanner(System.in);
        int[] myArray = new int[5];
        int max = Integer.MIN_VALUE;
        myArray[0] = tScan.nextInt();
        max = max>myArray[0]?max:myArray[0];
        myArray[1] = tScan.nextInt();
        max = max>myArray[1]?max:myArray[1];
        myArray[2] = tScan.nextInt();
        max = max>myArray[2]?max:myArray[2];
        myArray[3] = tScan.nextInt();
        max = max>myArray[3]?max:myArray[3];
        myArray[4] = tScan.nextInt();
        max = max>myArray[4]?max:myArray[4];
        System.out.printf("El número más grande del array es: %d. \n",max);

        tScan.close();
    }
}
