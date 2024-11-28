package Enums;

import Enums.enums.DiaSemana;
import Enums.modelos.ConvertidorColor;

public class app {
    public static String clear = "\033\143";
    public static void main(String[] args) {
        System.out.print(clear);
        ConvertidorColor convertidor = new ConvertidorColor();

        String[] coloresPrueba = {"#FF0000", "#000000", "#FFFF00", "#0000FF"};

        for (String color : coloresPrueba) {
            if (convertidor.convertirHexadecimal(color) == null) {
                System.out.println("El color " + color + " no existe.");
                continue;
            }else{
                System.out.println(color + " : " + convertidor.convertirHexadecimal(color));
            }
        }
    }
    
    public static String imprimirDiaLaboral(DiaSemana day){
        String message = (day+ (day.esDiaLaboral()?" Es día laboral":" No es día laboral"));
        System.out.println(message);
        return message;
    }
}
