package Clase_11;


public class min_val {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        int min = Integer.MAX_VALUE;
        int[] myArray = {8,6,9,4,5,7,10};
        for(int i=0;i<myArray.length;i++){
            min = myArray[i]<min?myArray[i]:min;
        }
        System.out.printf("El mínimo valor del array es: %d. \n",min);
    }
}
