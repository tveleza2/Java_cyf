package Asociacion.modelos;

public class Jugador {
    private String name;
    private Equipo team;
    
    public Jugador(String name, Equipo team){
        this.name=name;
        this.team=team;
    }
    public Jugador(){}
    public void setName(String name){this.name=name;}
    public String getName(){return this.name;}
    public void setTeam(Equipo team){this.team=team;}
    public Equipo getTeam(){return this.team;}

}
