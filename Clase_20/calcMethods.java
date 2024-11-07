package Clase_20;

import java.util.Scanner;

public class calcMethods {
    public static void main(String[] args){
        boolean running = true;
        Scanner myScanner = new Scanner(System.in);
        while (running) {
            System.out.print("\033\143");
            float result;
            String option = menu(myScanner);
            if (!option.equals("E")){
                result = opperate(myScanner, option);
                System.out.print("\033\143");
                System.out.printf("El resultado de la operación es: %.2f.\n",result);
                myScanner.nextLine();
            }else{
                running = false;
            }
            
        }
        System.out.print("\033\143");
        System.out.println("Hasta pronto");
        myScanner.close();
    }

    public static String menu(Scanner scan){
        boolean valid = false;
        String opc = "";
        while (!valid) {
            valid = true;
            System.out.println("Seleccione la operación que deseas realizar:");
            System.out.println("s. Suma, ");
            System.out.println("r. Resta, ");
            System.out.println("m. Multiplcación, ");
            System.out.println("d. División.");
            System.out.println("e. Salir");
            opc = scan.nextLine().toUpperCase();
            switch (opc) {
                case "S","R","M","D","E":
                    valid=true;
                    break;
                default:
                    System.out.print("\033\143");
                    System.out.println("El caracter ingresado no corresponde a una operación soportada.");
                    valid = false;
                    break;
            }
        }
        return opc;
    }

    public static float opperate(Scanner scan, String option) {
        float result = -1;
        boolean valid = false;
        System.out.print("\033\143");
        do {
            System.out.print("Introduzca el primer número: ");
            int a = scan.nextInt();
            scan.nextLine();
            System.out.print("Introduzca el segundo número: ");
            int b = scan.nextInt();
            scan.nextLine();
            valid = true;
            switch (option) {
                case "S":
                    System.out.print("\033\143");
                    result = a+b;
                    break;
                case "R":
                    System.out.print("\033\143");
                    result = a-b;
                    break;
                case "M":
                    System.out.print("\033\143");
                    result = a*b;
                    break;
                case "D":
                    System.out.print("\033\143");
                    // result = safeDivision(a, b);
                    // valid = result!=Float.NaN;
                    // if (!valid) {System.out.println("El denominador tiene que ser distinto de cero.");}
                    try {
                        result = a/b;
                    } catch (ArithmeticException e) {
                        valid = false;
                        System.out.println("El denominador no puede ser cero.");
                    }
                    break;
                default:
                    break;
            }
        } while (!valid);
        
        
        return result;
    }


    public static float safeDivision(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException e) {
            return Float.POSITIVE_INFINITY;
        }
    }
}
