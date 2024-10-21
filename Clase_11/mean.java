package Clase_11;


public class mean {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        float[] myArray = new float[20];
        float sum = 0;
        System.out.println("Arreglo: ");
        System.out.print("| ");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (float)(1 + Math.random() * 100);
            System.out.printf(" %.2f |",myArray[i]);
        }

        for (float number: myArray){sum = sum+number;}
        System.out.printf("\nLa suma de todos los elementos del array es: %.2f.\n",sum);
        System.out.printf("El promedio de todos los elementos del array es: %.2f.\n",sum/myArray.length);

    }
}
