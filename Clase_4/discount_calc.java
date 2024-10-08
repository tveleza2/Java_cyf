package Clase_4;

import java.util.Scanner;

public class discount_calc {
    public static void main(String[] args) {
        boolean running = true;
        Scanner myScan = new Scanner(System.in);
        float finalPrice = -1;
        System.out.print("\033\143");
        System.out.println("Bienvenido a tu calculadora de descuentos");
        while (running) {
            
            boolean valid = false;
            while (!valid) {
                System.out.print("Escriba el precio original del producto: ");
                float originalPrice = myScan.nextFloat();
                valid = true;
                if (originalPrice>=100) {
                    finalPrice = originalPrice * 0.9f;
                }else if (originalPrice>0 & originalPrice<100){
                    finalPrice = originalPrice;
                }else{
                    System.out.print("\033\143");
                    System.out.println("El precio ingresado no es válido");
                    valid = false;
                }
            }
            System.out.print("\033\143");
            System.err.println("El precio final es: "+finalPrice);
            System.out.println("¿Quieres continuar con otro producto?");
            System.out.println("y. Yes");
            System.out.println("n. No");
            myScan.nextLine();
            String ans = myScan.nextLine();
            if (ans.toLowerCase().equals("y")){
                running = true;
            };
        }
        System.out.print("\033\143");
        System.out.println("¡Hasta la próxima!");
        myScan.close();
    }
}
