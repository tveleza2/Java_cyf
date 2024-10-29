package Clase_16;
import java.util.Scanner;

public class squareDraw {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Scanner tSc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int size = tSc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==0 || i==size-1){
                    System.out.print("*");
                }else if (j==0 || j==size-1){
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
                if(j==size-1){System.out.print("\n");}
            }
        }
        tSc.close();
    }
}
