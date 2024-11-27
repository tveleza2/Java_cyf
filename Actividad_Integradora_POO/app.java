package Actividad_Integradora_POO;
import java.util.Scanner;

import Actividad_Integradora_POO.modelos.*;


public class app {
    public static String clear = "\033\143";
    public static Biblioteca myBib = new Biblioteca();
    public static Persona user = new Persona();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(clear);
        boolean continuar = true;
        System.out.print("Bienvenido, por favor ingrese su nombre y apellido: ");
        user.setName(sc.nextLine());
        user.setSurname(sc.nextLine());
        do {
            continuar = menu(sc);
        } while (continuar);

    }


    public static boolean menu(Scanner sc) {
        System.out.print(clear); // Limpia la consola
        Libro tempLib;
        String name;
        boolean output = true;
        System.out.println("_____________GESTOR DE BIBLIOTECA____________\nSeleccione la opción que desea ejectar\n1. Agregar libro a la biblioteca.\n2. Mostrar libros en la biblioteca.\n3. Prestar libro\n4. Mostrar libros prestados\n5. Devolver libro\n6. Salir.");
        int option = Integer.valueOf(sc.nextLine());
        System.out.print(clear); // Limpia la consola
        if (myBib.getArray().length==0 && option!=1) {
            System.out.println("Para poder mostrar libros, debes agregar primero alguno a la biblioteca.");
        }else{
            switch (option) {
                case 1:
                    tempLib = myBib.leerLibro(sc);
                    myBib.agregarLibro(tempLib);
                    break;
                case 2:
                    myBib.mostrarInfo();
                    break;
                case 3:
                    System.out.println("Ingrese el titulo del libro a prestar: ");
                    name = sc.nextLine();
                    tempLib = myBib.buscarLibro(name);
                    myBib.prestarLibro(tempLib);
                    user.prestarLibro(tempLib);
                    break;
                case 4:
                    user.mostrarInfo();
                    break;
                case 5:
                    System.out.println("Ingrese el titulo del libro a devolver: ");
                    name = sc.nextLine();
                    tempLib = myBib.buscarLibro(name);
                    myBib.devolverLibro(tempLib);
                    user.devolverLibro(tempLib);
                    break;
                case 6:
                    output = false;
                    break;
    
                default:
                System.out.println("Opción no válida");
                    break;
            }
        }
        
        System.out.print("Presiona enter para continuar: ");
        sc.nextLine();
        return output;
    }
}
