package Clase_11;


public class counting_even {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        int[] myArray = new int[9];
        int evenValues = 0;
        System.out.println("Array: ");
        System.out.print("| ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (1 + Math.random() * 100);
            System.out.print(myArray[i] + " | ");
        }

        for (int number:myArray) {
            evenValues = number%2 == 0?evenValues+1:evenValues;
        }
        System.out.printf("\n El número de elementos pares es: %d. \n",evenValues);

    }
}
