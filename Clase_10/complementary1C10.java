package Clase_10;
import java.util.Scanner;
// Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros. 
// Luego, suma los elementos ubicados en las posiciones pares del array 
// (es decir, las posiciones 0, 2 y 4) y muestra por consola el resultado de la suma. 
// Utiliza exclusivamente las herramientas aprendidas hasta el momento.

public class complementary1C10 {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.println("Ingrese los números");
        myArray[0] = tScan.nextInt();
        myArray[1] = tScan.nextInt();
        myArray[2] = tScan.nextInt();
        myArray[3] = tScan.nextInt();
        myArray[4] = tScan.nextInt();
        int sum = myArray[0] + myArray[2] + myArray[4];
        System.out.printf("El resultado de la suma de los elementos es: %d. \n",sum);
        tScan.close();
    }
}
