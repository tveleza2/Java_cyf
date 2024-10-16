package Clase_9;
import java.util.Scanner;

public class passwordValidation {
    public static void main(String[] args) {
        String clear = "\033\143";
        System.out.print(clear);
        Scanner tScan = new Scanner(System.in);
        boolean valid = false;
        String myPassword;
            while (!valid) {
                System.out.print("Por favor digite la contraseña: ");
                myPassword = tScan.nextLine();
                System.out.print(clear);
                boolean lengthCondition = myPassword.length()>=8?true:false;
                boolean upperCondition = myPassword.chars().anyMatch(c->Character.isUpperCase(c));
                boolean lowerCondition = myPassword.chars().anyMatch(c->Character.isLowerCase(c));
                boolean numCondition = myPassword.chars().anyMatch(c->Character.isDigit(c));
                boolean spCharCondition = myPassword.chars().anyMatch(c -> !Character.isLetterOrDigit(c));
                boolean fullCondition = lengthCondition & upperCondition & lowerCondition & numCondition & spCharCondition;
                String message = lengthCondition?upperCondition?lowerCondition?numCondition?spCharCondition?"La contraseña es válida":"La contraseña debe contener al menos un caracter especial":"La contraseña debe contener al menos un dígito":"La contraseña debe contener minúsculas":"La contraseña debe tener mayúsculas":"La contraseña debe tener al menos 8 caracteres";
                System.out.println(message);
                valid = fullCondition;
                
            }
            tScan.close();
    }
}
