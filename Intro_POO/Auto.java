package Intro_POO;


public class Auto {
    String marca;
    String modelo;
    Integer año;
    
    public Auto(String marca, String modelo, Integer año) {
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
    }
    
    public Auto(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    }
    
    public Auto(String marca) {
    this.marca = marca;
    }
    
    public Auto() {
    }
    
    public void imprimirDatos() {
    if (this.año != null) {
    System.out.println("This is the year: " + this.año);
    } else {
    System.out.println(this.año + "Must be inicialized before print it");
    }
    if (this.marca != null) {
    System.out.println("This is the brand: " + this.marca);
    } else {
    System.out.println(this.marca + "Must be inicialized before print it");
    }
    if (this.modelo != null) {
    System.out.println("This is the model: " + this.modelo);
    } else {
    System.out.println(this.modelo + "Must be inicialized before print it");
    }
    }
    
    }