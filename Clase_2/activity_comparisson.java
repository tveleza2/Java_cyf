package Clase_2;

import java.util.Scanner;

public class activity_comparisson {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Escriba el primer número: ");
        Double x = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.print("Escriba el segundo número: ");
        Double y = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.println("¿Es "+x+" mayor a "+y+" ? "+ (x>y));
        System.out.println("¿Es "+x+" diferente a "+y+" ? "+ (x!=y));
        System.out.println("¿Es "+x+" divisible entre 2? "+ (x%2 == 0));

        System.out.print("Escriba el tercer número: ");
        Double z = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.print("Escriba el cuarto número: ");
        Double w = myScanner.nextDouble();
        myScanner.nextLine();
        myScanner.close();
        System.out.println("¿Es "+x+" mayor a "+y+" y "+z+" mayor a "+w+" ? "+ ((x>y)&(z>w)));
        System.out.println("¿Es "+x+" mayor a "+y+" o "+z+" mayor a "+w+" ? "+ ((x>y)||(z>w)));
    }
}
