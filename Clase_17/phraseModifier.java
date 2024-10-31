package Clase_17;

import java.util.Scanner;
import java.util.Arrays;

public class phraseModifier {
    private static String phrase = "";
    private static String[] words;
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear); // Limpia la consola
        Scanner scanner = new Scanner(System.in);
        
        int op;
        do {
            System.out.println(phrase.isEmpty() ? "___ No hay oración cargada ___" : ("___ La oración es: "+phrase+" ___"));
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
            op = scanner.nextInt();
            scanner.nextLine();
            if(phrase.isEmpty() && op!=1){
                System.out.print(clear);
                System.out.println("Primero tienes que crear una oración");
                continue;}
            System.out.print(clear);
            switch (op) {
                case 1:
                    if (phrase.isEmpty()) {
                        System.out.print("Ingrese una nueva oracion : ");
                        phrase = scanner.nextLine();
                        words = phrase.trim().split("\\s");
                        System.out.println("La oracion creada es : " + phrase);
                    } else {
                        phrase = "";
                        words = null;
                        System.out.println("La oracion ha sido borrada, ya no hay oracion!");
                    }
                    break;
                case 2:
                    System.out.printf("La frase \"%s\" tiene %d caracteres.\n",phrase,phrase.length());
                    break;
                case 3:
                    int countWords = words.length;
                    System.out.printf("El número de palabras de la frase es %d.\n",countWords);
                    break;
                case 4:
                    String[] loWords = words.clone();
                    for (int i = 0; i < words.length; i++) {
                        loWords[i] = loWords[i].toLowerCase(); 
                    } 
                    Arrays.sort(loWords);
                    System.out.printf("Las palabras ordenadas alfabéticamente son: \n %s.\n",Arrays.toString(loWords));
                    break;
                case 5:
                    System.out.print("Ingrese la posición que desea consultar en la frase: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine();
                    System.out.printf("La palabra en la posición %d es: %s.\n",pos+1,words[pos]);
                    break;
                case 6:
                    System.out.print("Ingrese la palabra que desea consultar en la frase: ");
                    String searchingWord= scanner.nextLine();
                    boolean found = false;
                    int loc=-1;
                    for (int i = 0; i < words.length; i++) {
                        if(words[i].equals(searchingWord)){
                            found = true;
                            loc = i+1;
                            break;
                        }   
                    }
                    System.out.printf(found?"Se encontró la palabra \"%s\" en la posición %d.\n":"No se encontró la palabra %s.\n",searchingWord,loc);
                    break;
                case 7:
                    boolean valid = false;
                    int location = 0;
                    System.out.print(clear);
                    do {
                        System.out.print("Ingrese la palabra que desea cambiar: ");
                        String oldWord = scanner.nextLine();
                        
                        for (int i = 0; i < words.length; i++) {
                            if(words[i].equals(oldWord)){
                                valid = true;
                                location = i;
                                break;
                            }   
                        }

                        if(!valid){
                            System.out.print(clear);
                            System.out.println("La palabra no es válida.");
                        }
                    } while (!valid);
                    System.out.print("Ingrese la palabra o frase que desea agregar en remplazo: ");
                    String neWord = scanner.nextLine();
                    phrase = String.join(" ",Arrays.copyOfRange(words, 0, location))+" "+neWord+" "+String.join(" ",Arrays.copyOfRange(words, location+1, words.length));
                    words = phrase.trim().split("\\s");
                    System.out.printf("La nueva frase es: %S.\n",phrase);
                    break;
                case 8:
                    System.out.print(clear);
                    System.out.print("Ingrese la palabra o frase que desea añadir: ");
                    String additionWord = scanner.nextLine();
                    phrase = phrase +" "+ additionWord;
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

}
