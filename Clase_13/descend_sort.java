package Clase_13;
import java.util.Arrays;

public class descend_sort {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
        array[i] = (int) (1 + Math.random() * 100);
        }
        
        System.out.println("Arreglo inicial:" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Arreglo ascendente: " + Arrays.toString(array));
        invertirArray(array);
        System.out.println("Arreglo descendente: " + Arrays.toString(array));
        
        }
        
        private static void invertirArray(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
        int temp = array[i];
        array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = temp;
        }
        }
}
