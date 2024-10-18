package Clase_10;


public class summing_elements {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        int[] myArray = {1,2,3};
        System.out.printf("El resultado de la suma de los elementos del vector es: %d.\n",myArray[0]+myArray[1]+myArray[2]);
    }
}
