package Asociacion.modelos;

public class Equipo {
    private String name;
    private Jugador[] players;
    
    public Equipo(String name, Jugador[] players){
        this.name=name;
        this.players=players;
    }
    public Equipo(){}
    public void setName(String name){
        this.name=name;
    }
    public String getName(){return this.name;}
    public void setPlayers(Jugador[] players){
        this.players=players;
    }
    public Jugador[] getPlayers(){return this.players;}
}
