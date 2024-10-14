package Clase_6;
import java.util.Scanner;

public class safe_division {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        float n1 = tScan.nextFloat();
        tScan.nextLine();
        System.out.print("Ingrese el segundo número: ");
        float n2 = tScan.nextFloat();
        float result;
        try {
            result = n1/n2;
            System.out.println("El resultado es "+result);
        } catch(ArithmeticException e){
            System.out.println("La división no puede ser por cero.");
        }
        catch (Exception e) {
            System.out.println("Error desconocido.");
        }
        tScan.close();
    }
}
