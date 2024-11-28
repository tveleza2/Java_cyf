package Enums.enums;

public enum Color {
    ROJO("#FF0000"),
    AMARILLO("#FFFF00"),
    AZUL("#0000FF");

    private String hexCode;
    private Color(String hex){
        this.hexCode = hex;
    }

    public String getHex(){
        return this.hexCode;
    }

    public static Color getColor(String hex){
        for (Color c : Color.values()) {
            if(c.getHex().equals(hex)){
                return c;
            }
        }
        return null;
    }
}
