package Clase_6;
import java.util.Scanner;
import java.util.InputMismatchException;

public class subtr_exception {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.println(clear);
        Scanner tScan = new Scanner(System.in);
        try {
        System.out.print("Ingrese el primer número: ");
        int n1 = tScan.nextInt();
        tScan.nextLine();
        System.out.print("Ingrese el segundo número: ");
        int n2 = tScan.nextInt();
        int result;        
        result = n1-n2;
        System.out.println("El resultado es "+result);
        }catch (InputMismatchException e) {
            System.out.println("El dato ingresado no es un número");
        }catch(Exception e){
            System.out.println("Error desconocido");
        }
        tScan.close();
    }
}
