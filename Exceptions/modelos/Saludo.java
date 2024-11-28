package Exceptions.modelos;

public class Saludo {
    private String name;
    public Saludo(){}
    public Saludo(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
