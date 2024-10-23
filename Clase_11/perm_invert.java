package Clase_11;

public class perm_invert {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        int[] myArray = new int[10];
        int auxInt;
        System.out.println("Arreglo original");
        System.out.print("| ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (1 + Math.random() * 100);
            System.out.print(myArray[i] + " | ");
        }

        System.out.println("\n Arreglo invertido");

        System.out.print("| ");
        for(int i = 0; i < (int)(myArray.length/2);i++){
            auxInt = myArray[i];
            myArray[i] = myArray[myArray.length-i-1];
            myArray[myArray.length-i-1] = auxInt;
        }
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " | ");
        }
        System.out.println("");
    }
}
