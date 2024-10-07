package Clase_3;
import java.util.Scanner;

public class parity {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Write an integer number: ");
        int a = myScanner.nextInt();
        myScanner.nextLine();
        String message = a%2 == 0 ? "The number is even" : "The number is odd";
        myScanner.close();
        System.out.println(message);
    }
}
