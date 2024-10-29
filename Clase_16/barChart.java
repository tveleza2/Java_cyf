package Clase_16;

import java.util.Scanner;

public class barChart {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        int[] data = new int[4];
        String[] ast = new String[4];
        System.out.print("Ingrese los cuatro datos del gráfico de barras: ");
        for (int i = 0; i < data.length; i++) {
            do{
                data[i] = tSc.nextInt();
                if (i<1||i>20) {System.out.println("El número debe estar entre 1 y 20.");}
            }while(i<1||i>20);
            System.out.print("\033\143"); // Limpia la consola
            String asterisc="";
            for (int j = 0; j < data[i]; j++) {
                asterisc = asterisc+"*";
            }
            ast[i] = asterisc;
        }
        System.out.print("\033\143"); // Limpia la consola
        for (int i = 0; i < ast.length; i++) {
            System.out.print(data[i]+" ");
            System.out.println(ast[i]);
        }
        tSc.close();
    }
    
}
