package Encapsulamiento_Ocultamiento;

import Encapsulamiento_Ocultamiento.modelos.*;
import java.util.Scanner;

public class menuFigures {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        int opc;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            opc=Integer.valueOf(sc.nextLine());
            menuExecution(opc,sc);
        } while (opc!=4);
        
        sc.close();
    }

    public static void menu(){
        System.out.print("\033\143"); // Limpia la consola
        System.out.println("¿Qué figura desea calcular?\n1. Rectángulo\n2. Triángulo\n3. Círculo\n4. Salir");
    }

    public static void menuExecution(int option,Scanner scan){
        System.out.print("\033\143"); // Limpia la consola
        switch (option) {
            case 1:
                System.out.print("Ingrese el alto y el ancho del rectángulo: ");
                float ancho = Float.valueOf(scan.nextLine());
                float alto = Float.valueOf(scan.nextLine());
                rectangulo rec = new rectangulo(alto, ancho);
                rec.showFeatures();
                break;
            case 2:
                System.out.print("Ingrese la base y la altura del triángulo: ");
                float base = Float.valueOf(scan.nextLine());
                float alt = Float.valueOf(scan.nextLine());
                triangulo tri = new triangulo(base, alt);
                tri.showFeatures();
                break;
            case 3:
                System.out.print("Ingrese el radio del círculo: ");
                float radius = Float.valueOf(scan.nextLine());
                circulo circ = new circulo(radius);
                circ.showFeatures();
                break;
            case 4:
                // System.out.println("¡Hasta pronto!");
                break;
            default:
                System.out.println("Caso inválido");
                break;
        }

        System.out.print("Presione enter para continuar: ");
        scan.nextLine();
    }
}
