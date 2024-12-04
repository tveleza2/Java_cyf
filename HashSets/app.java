package HashSets;
import HashSets.modelos.*;
import java.util.Scanner;

public class app {
    private static RegistroDeInvitados myReg = new RegistroDeInvitados();
    private static Libreria myLib = new Libreria();
    public static final String clear = "\033\143";

    public static void main(String[] args) {
        System.out.print(clear); // Limpia la consola
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        int program = 2;
        
        do {
            switch (program) {
                case 1:
                    running = menuInvitados(sc);
                    break;
                case 2:
                    running = menuLibrary(sc);
                    break;
                default:
                System.out.println("Opción de programa inválido.");
                    break;
            }
            
        } while (running);
    }

    public static boolean menuLibrary(Scanner sc){
        System.out.println("Selecciona la opción:\n1. Agregar libro.\n2. Eliminar libro.\n3. Mostrar catalogo.\n4. Salir");
        int option = Integer.valueOf(sc.nextLine());
        System.out.print(clear);
        switch (option) {
            case 1:
                System.out.print("Nombre del autor, el isbn y título: ");
                String aut = sc.nextLine();
                int isbn = Integer.valueOf(sc.nextLine());
                String tit = sc.nextLine();
                myLib.agregarLibro(aut, isbn, tit);
                break;
            case 2:
                System.out.print("ISBN del libro a remover: ");
                myLib.eliminarLibro(Integer.valueOf(sc.nextLine()));
                break;
            case 3:
                myLib.mostrarCatalogo();
                break;
            case 4:
                System.out.println("¡Adios!");
                return false;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return true;
    }



    public static boolean menuInvitados(Scanner sc){
        System.out.println("Selecciona la opción:\n1. Agregar invitado.\n2. Eliminar invitado.\n3. Mostrar lista de invitados.\n4. Salir");
        int option = Integer.valueOf(sc.nextLine());
        System.out.print(clear);
        switch (option) {
            case 1:
                System.out.print("Nombre del invitado a añadir: ");
                myReg.agregarInvitado(sc.nextLine());
                break;
            case 2:
                System.out.print("Nombre del invitado a remover: ");
                myReg.eliminarInvitado(sc.nextLine());
                break;
            case 3:
                myReg.mostrarInvitados();
                break;
            case 4:
                System.out.println("¡Adios!");
                return false;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return true;
    }
}
