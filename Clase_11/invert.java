package Clase_11;


// Escribe un programa que recorra un array de enteros y los imprima en orden inverso, comenzando desde el último elemento.. El tamaño y los números  a contener pueden ser de tu elección.
public class invert {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        int[] myArray = new int[10];
        System.out.println("Arreglo original");
        System.out.print("| ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (1 + Math.random() * 100);
            System.out.print(myArray[i] + " | ");
        }
        System.out.println("\n Arreglo invertido");

        System.out.print("| ");
        for(int i = myArray.length-1; i >=0;i--){
            System.out.print(myArray[i]+" | ");
        }
        System.out.println("");

    }
}
