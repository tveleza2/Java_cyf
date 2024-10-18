package Clase_10;
import java.util.Scanner;
import java.util.Arrays;


public class copying_elements {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        int[] myArray = {1,2,3};
        int[] copyArray = new int[5];
        copyArray[0] = myArray[0];
        copyArray[1] = myArray[1];
        copyArray[2] = myArray[2];
        System.out.println("Ingrese los números:");
        copyArray[3] = tScan.nextInt();
        copyArray[4] = tScan.nextInt();
        System.out.println(Arrays.toString(copyArray));

        tScan.close();
    }
}
