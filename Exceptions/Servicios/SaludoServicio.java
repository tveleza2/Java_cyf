package Exceptions.Servicios;
import java.util.Scanner;

import Exceptions.modelos.*;

public class SaludoServicio {
    private Saludo salutate;
    public SaludoServicio(Scanner sc) throws Exception{
        System.out.print("Ingresa tu nombre: ");
        String name="";
        
        name =  sc.nextLine();
        if(name.length()<=2){
            throw new Exception("No puedes tener un nombre de menos de tres letras.");
        }
        
        this.salutate = new Saludo(name);
    }
    public void saludar(){
        System.out.printf("Hola %s, bienvenido a JAVA, tu curso divertido.\n",this.salutate.getName());
    }
}
