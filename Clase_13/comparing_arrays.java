package Clase_13;
import java.util.Arrays;
public class comparing_arrays {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        
        int[] myArray1 = {5,10,15,20};
        int[] myArray2 = {5,10,15,21};
        System.out.println("El arreglo 1 es: \n"+Arrays.toString(myArray1));
        System.out.println("El arreglo 2 es: \n"+Arrays.toString(myArray2));
        boolean eqs = Arrays.equals(myArray1,myArray2);
        System.out.println("¿Los dos arreglos son iguales?: "+eqs);
    }
}
