package Clase_3;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        boolean running = true;
        Scanner myScanner = new Scanner(System.in);
        while (running) {
            System.out.print("\033\143");
            System.out.print("Introduzca el primer número: ");
            float a = myScanner.nextFloat();
            myScanner.nextLine();
            System.out.print("Introduzca el segundo número: ");
            float b = myScanner.nextFloat();
            myScanner.nextLine();
            float result = 0;
            String opperation = "";
            System.out.print("\033\143");
            boolean valid = false;
            while (!valid) {
                valid = true;
                System.out.println("Seleccione la operación que deseas realizar:");
                System.out.println("s. Suma, ");
                System.out.println("r. Resta, ");
                System.out.println("m. Multiplcación, ");
                System.out.println("d. División.");
                
            
                switch (myScanner.nextLine().toUpperCase()) {
                    case "S":
                        System.out.print("\033\143");
                        opperation = "sumar";
                        result = a+b;
                        break;
                    case "R":
                        System.out.print("\033\143");
                        opperation = "restar";
                        result = a-b;
                        break;
                    case "M":
                        System.out.print("\033\143");
                        opperation = "multiplicar";
                        result = a*b;
                        break;
                    case "D":
                        System.out.print("\033\143");
                        opperation = "dividir";
                        valid = b == 0 ? false:true;
                        result = b == 0 ? 0:a/b;
                        if (!valid) {
                            System.out.println("El segundo número no puede ser 0.");
                        }
                        break;
                    default:
                        System.out.print("\033\143");
                        System.out.println("El caracter ingresado no corresponde a una operación soportada.");
                        valid = false;
                        break;
                }
            }
            System.out.print("\033\143");
            System.out.print("El resultado de " + opperation);
            System.out.println(" " + a + " y " + b + " es "+result);
            System.out.println("¿Quieres continuar con otra operación?");
            System.out.println("y. Yes");
            System.out.println("n. No");
            running = myScanner.nextLine().toLowerCase().equals("y");
        }
        System.out.print("\033\143");
        System.out.println("¡Hasta la próxima!");
        myScanner.close();
    }
}
