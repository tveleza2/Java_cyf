package Clase_3;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        float a = myScanner.nextFloat();
        myScanner.nextLine();
        System.out.print("Introduzca el segundo número: ");
        float b = myScanner.nextFloat();
        myScanner.nextLine();
        float result = 0;
        String opperation = "";

        boolean valid = false;
        while (!valid) {
            valid = true;
            System.out.println("s. Suma, ");
            System.out.println("r. Resta, ");
            System.out.println("m. Multiplcación, ");
            System.out.println("d. División.");
            System.out.print("Seleccione la operación que desearealizar:");
        
            switch (myScanner.nextLine().toUpperCase()) {
                case "S":
                    opperation = "sumar";
                    result = a+b;
                    break;
                case "R":
                    opperation = "restar";
                    result = a-b;
                    break;
                case "M":
                    opperation = "multiplicar";
                    result = a*b;
                    break;
                case "D":
                    opperation = "dividir";
                    result = a/b;
                    break;
                default:
                    System.out.println("The character introduced does not correspond to a supported opperation");
                    valid = false;
                    break;
            }
        }

        myScanner.close();
        System.out.print("El resultado de " + opperation);
        System.out.println(" " + a + " y " + b + " es "+result);
        
    }
}
