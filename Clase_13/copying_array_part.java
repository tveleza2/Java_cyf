package Clase_13;
// Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.
import java.util.Arrays;
import java.util.Scanner;

public class copying_array_part {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[5];
        int indiceInicial;
        int indiceFinal;
        
        for (int i = 0; i < array.length; i++) {
        array[i]= (int) (1+ Math.random()*10);
        System.out.printf("El valor es %d en el indice %d \n",array[i],i );
        }
        
        
        
        do {
        System.out.print("Ingresa un indice inicial: ");
        indiceInicial = scanner.nextInt();
        
        System.out.print("Ingresa un indice final: ");
        indiceFinal = scanner.nextInt();
        } while (indiceInicial > indiceFinal);
        
        
        int [] nuevoArray = Arrays.copyOfRange(array, indiceInicial, indiceFinal + 1);
        
        System.out.printf("El nuevo array es: %s \n",Arrays.toString(nuevoArray)); // "\n" Salto de linea manual
        
        
        
        scanner.close();
        
        }
}
