package Clase_7;
import java.util.*;

public class string_concat {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        System.out.print("Bienvenido, por favor ingrese su nombre: ");
        String firstName = tScan.nextLine();
        System.out.print("Ahora escribe tu apellido: ");
        String lastName = " "+tScan.nextLine();
        String fullName = firstName.concat(lastName);
        System.out.printf("Sea bienvenido %s.\n",fullName);
        tScan.close();
    }
}
