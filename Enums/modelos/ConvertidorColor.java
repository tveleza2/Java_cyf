package Enums.modelos;
import Enums.enums.*;

public class ConvertidorColor {
    public Color convertirHexadecimal(String hex){
        return Color.getColor(hex);
    }
}
