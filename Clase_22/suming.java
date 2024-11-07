package Clase_22;

public class suming {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        int[] myArr = {0,1,2,3,4,5,6};
        int sum = 0;
        for (int num : myArr) {
            sum+=num;
        }
        System.out.printf("La suma de los números del array es %d.\n",sum);
    }
}
