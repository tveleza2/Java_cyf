package Clase_10;
import java.util.Scanner;
public class element_mean {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        int[] myArray = new int[4];
        System.err.println("Ingrese los cuatro números del array: ");
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            myArray[i] = tScan.nextInt();
            sum = sum+myArray[i]; 
        }
        float result = sum/4;
        System.err.printf("El promedio de los valores es: %f. \n",result);
        tScan.close();
    }
}
