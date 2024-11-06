package Clase_20;

import java.util.Scanner;

public class passValidationMethods {
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
                valid = esSegura(myPassword);            
            }
            tScan.close();
    }


    public static boolean esSegura(String pass){
        boolean lengthCondition = pass.length()>=8?true:false;
        boolean upperCondition = pass.chars().anyMatch(c->Character.isUpperCase(c));
        boolean lowerCondition = pass.chars().anyMatch(c->Character.isLowerCase(c));
        boolean numCondition = pass.chars().anyMatch(c->Character.isDigit(c));
        boolean spCharCondition = pass.chars().anyMatch(c -> !Character.isLetterOrDigit(c));
        String message = lengthCondition?upperCondition?lowerCondition?numCondition?spCharCondition?"La contraseña es segura":"La contraseña debe contener al menos un caracter especial":"La contraseña debe contener al menos un dígito":"La contraseña debe contener minúsculas":"La contraseña debe tener mayúsculas":"La contraseña debe tener al menos 8 caracteres";
        System.out.println(message);
        return (lengthCondition & upperCondition & lowerCondition & numCondition & spCharCondition);
    }
}
