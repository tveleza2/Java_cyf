package Clase_11;

// Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los elementos en una sola cadena, separados por espacios, e imprime el resultado por consola.

public class concat {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        String[] myArray = {"p","e","r","r","o"};
        String concatArray = "";
        for(String letter:myArray){
            concatArray = concatArray+" "+letter;
        }
        System.out.printf("El array concatenado es: %s. \n",concatArray);
    }
}
