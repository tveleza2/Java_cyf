package Clase_5;

import java.util.Scanner;

public class geometric_figure {
    public static void main(String[] args){
        boolean running = true;
        Scanner myScan = new Scanner(System.in);
        
        while (running) {
            System.out.print("\033\143");
            System.out.println("Bienvenido a tu calculadora de áreas");
            boolean valid = false;
            String figure = "";
            double area = -1;
            while (!valid) {
                System.out.println("¿Qué figura desea calcular?: ");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                int option = myScan.nextInt();
                valid = true;
                area = switch (option){
                    case 1 -> {
                        figure = "círculo";
                        System.out.print("\033\143");
                        System.out.print("Introduzca el radio del círculo: ");
                        double radius = myScan.nextDouble();

                        yield Math.PI * radius*radius;
                    }
                    case 2 -> {
                        figure = "cuadrado";
                        System.out.print("\033\143");
                        System.out.print("Introduzca la longitud del lado del cuadrado: ");
                        double side = myScan.nextDouble();
                        yield side*side;
                    }
                    case 3 -> {
                        figure = "triángulo";
                        System.out.print("\033\143");
                        System.out.print("Introduzca la base del triángulo: ");
                        double base = myScan.nextDouble();
                        System.out.print("\033\143");
                        System.out.print("Introduzca la altura del triángulo: ");
                        double height = myScan.nextDouble();
                        yield base*height/2;
                    }
                    default ->{
                        System.out.print("\033\143");
                        System.out.println("La opción ingresada no es válida.");
                        valid = false;
                        yield -1;}
                };
                
            }
            System.out.print("\033\143");
            System.err.println("El área del "+ figure +" es: " + area);
            System.out.println("¿Quieres continuar con otra figura? \ny. Yes \nn. No");
            myScan.nextLine();
            String ans = myScan.nextLine();
            running = false;
            if (ans.toLowerCase().equals("y")){
                running = true;
            };
        }
        System.out.print("\033\143");
        System.out.println("¡Hasta la próxima!");
        myScan.close();
    }
}
