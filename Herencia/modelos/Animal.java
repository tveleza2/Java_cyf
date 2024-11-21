package Herencia.modelos;

public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(){

    }

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void comer(){
        System.out.printf("%s comió.\n",this.nombre);
    }
    public void dormir(){
        System.out.printf("%s se durmió.\n",this.nombre);
    }
}
