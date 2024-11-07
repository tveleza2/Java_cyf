package Clase_21;

import java.util.Arrays;
import java.util.Scanner;

public class phraseManipulationMethods {
    private static String phrase = "";
    private static String[] words;
    private static String clear = "\033\143";
    public static void main(String[] args) {
        System.out.print(clear); // Limpia la consola
        Scanner scanner = new Scanner(System.in);
        int op;
        do {
            op = menu(phrase, scanner);
            if(phrase.isEmpty() && op!=1){
                System.out.print(clear);
                System.out.println("Primero tienes que crear una oración");
                continue;}
            System.out.print(clear);
            switch (op) {
                case 1:
                    phrase = createErrasePhrase(phrase,scanner);
                    words = phrase.isEmpty()?null:phrase.trim().split("\\s");
                   break;
                case 2:
                    System.out.printf("La frase \"%s\" tiene %d caracteres.\n",phrase,phrase.length());
                    break;
                case 3:
                    int countWords = words.length;
                    System.out.printf("El número de palabras de la frase es %d.\n",countWords);
                    break;
                case 4:
                    System.out.printf("Las palabras ordenadas alfabéticamente son: \n %s.\n",Arrays.toString(sortAscending(words)));
                    break;
                case 5:
                    System.out.print("Ingrese la posición que desea consultar en la frase: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.printf("La palabra en la posición %d es: %s.\n",pos+1,words[pos]);
                    break;
                case 6:
                    System.out.print("Ingrese la palabra que desea consultar en la frase: ");
                    String searchingWord = scanner.nextLine();
                    pos = findInPhrase(phrase,searchingWord);
                    System.out.printf(pos!=-1?"Se encontró la palabra \"%s\" en la posición %d.\n":"No se encontró la palabra \"%s\".\n",searchingWord,pos);
                    break;
                case 7:
                    phrase = editPhrase(scanner, phrase);
                    words = phrase.trim().split("\\s");
                    System.out.printf("La nueva frase es: %S.\n",phrase);
                    break;
                case 8:
                    phrase = addWordToPhrase(scanner,phrase);
                    words = phrase.trim().split("\\s");
                    System.out.printf("La nueva frase es: %S.\n",phrase);
                    break;
                case 9:
                    System.out.println("Eligio salir!");
                    break;
                default:
                    System.out.println("Ingreso una opcion que es invalida/incorrecta");
                    break;
            }
            System.out.println("Presione enter para continuar.");
            scanner.nextLine();
            System.out.print(clear); // Limpia la consola
        } while (op != 9);
        
        scanner.close();
    }


    public static int menu(String oracion,Scanner scanner){
        int op;
        System.out.println(phrase.isEmpty() ? "___ No hay oración cargada ___" : ("___ La oración es: "+oracion+" ___"));
        System.out.println("Opciones");
        System.out.println("1 - " + (phrase.isEmpty() ? "Crear la Oración" : "Borrar la Oración"));
        System.out.println("2 - Contar caracteres de la oración.");
        System.out.println("3 - Contar palabras dentro de la oración.");
        System.out.println("4 - Ordenar alfabéticamente las palabras de la oración");
        System.out.println("5 - Extraer palabra de la oración");
        System.out.println("6 - Buscar palabra en la oración");
        System.out.println("7 - Modificar palabra (con palabra o frase)");
        System.out.println("8 - Añadir información al final de la oración");
        System.out.println("9 - Salir del programa");
        System.out.print("Seleccione una opcion del menu : ");
        
        try {
            op = Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            op = 10;
        }
        
        return op;
    }

    public static String createErrasePhrase(String oracion,Scanner scanner){
        if (phrase.isEmpty()) {
            System.out.print("Ingrese una nueva oracion : ");
            oracion = scanner.nextLine();
            System.out.println("La oracion creada es : " + oracion);
        } else {
            oracion = "";
            System.out.println("La oracion ha sido borrada, ya no hay oracion!");
        }
        return oracion;
    }

    public static String[] sortAscending(String[] wordArray) {
        String[] loWords = wordArray.clone();
        for (int i = 0; i < words.length; i++) {
            loWords[i] = loWords[i].toLowerCase(); 
        } 
        Arrays.sort(loWords);
        return loWords;
    }

    public static int findInPhrase(String oracion,String searchingWord){
        int loc=-1;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(searchingWord)){
                loc = i+1;
                break;
            }   
        }
        return loc;
    }

    public static String editPhrase(Scanner scanner,String oracion){
        int location = -1;
        System.out.print(clear);
        do {
            System.out.print("Ingrese la palabra que desea cambiar: ");
            String oldWord = scanner.nextLine();
            location = findInPhrase(oracion, oldWord);

            if(location==-1){
                System.out.print(clear);
                System.out.println("La palabra no es válida.");
            }
        } while (location<0);
        System.out.print("Ingrese la palabra o frase que desea agregar en remplazo: ");
        String neWord = scanner.nextLine();
        String[] wordsOracion = oracion.trim().split("\\s");
        oracion = String.join(" ",Arrays.copyOfRange(wordsOracion, 0, location-1))+" "+neWord+" "+String.join(" ",Arrays.copyOfRange(words, location+1, wordsOracion.length));
        return oracion;
    }

    public static String addWordToPhrase(Scanner scanner, String oracion){
        System.out.print("Ingrese la palabra o frase que desea añadir: ");
        String additionWord = scanner.nextLine();
        return oracion +" "+ additionWord;
    }
}
