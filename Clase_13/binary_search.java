package Clase_13;

// La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el arreglo generado originalmente, solicitar al usuario el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.

import java.util.Arrays;
import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        int[] myArray = {5,10,15,20};
        System.out.println("El arreglo es: \n"+Arrays.toString(myArray));
        System.out.print("¿Qué número deseas buscar? : ");
        int searchNumber = tScan.nextInt();
        int index = Arrays.binarySearch(myArray, searchNumber);
        if(index>=0){
            System.out.printf("El entero %d se encuentra en la posición %d.\n",searchNumber,index);
        } else{
            System.out.println("El elemento no se encuentra en el arreglo.");
        }
        tScan.close();
    }
}
