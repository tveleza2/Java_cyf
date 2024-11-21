package Herencia;
import Herencia.modelos.*;

public class app{
    public static void main(String[] args) {
        System.out.print("\033\143"); // Limpia la consola
        Perro loki = new Perro("Loki", 10, "Fila");
        Gato moca = new Gato("Moca", 3, "Calica");
        Animal[] animals = {loki, moca, new Perro("Mongo",2,"Pastor"),new Perro("Java",2,"Pastor"),new Gato("Grey", 3, "Gris"),new Perro("Max",10,"Fila"),new Gato("Chiqui", 1, "Calica"),new Perro("Ginger",9,"Bernés"),new Gato("Kira", 2, "Calica"),new Gato("Silvestre", 3, "Manchas")};
        listRecorrida(animals);
        
    }

    public static void listRecorrida(Animal[] lista) {
        for (Animal animal : lista) {
            if(animal instanceof Perro p){
                System.out.println("Perro");
                p.ladra();
                p.dormir();
            }else if(animal instanceof Gato g){
                System.out.println("Gato");
                g.maulla();
                g.comer();
            }
        }
    }
}