package Clase_20;
import java.util.Scanner;

public class parityMethods {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear); // Limpia la consola
        Scanner pepe = new Scanner(System.in);
        int numero = pedirNumero(pepe);
        String message = esPar(numero)?"El número %d es par.\n":"El número %d es impar.\n";
        System.out.print(clear); // Limpia la consola
        System.out.printf(message,numero);
        pepe.close();
    }

    public static int pedirNumero(Scanner scan) {
        System.out.print("Por favor ingrese un número: ");
        Integer numero = null;
        do {
            try {
                numero = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        return numero;
    }
    
    public static boolean esPar(int number){
        return number%2 == 0;
    }
}
