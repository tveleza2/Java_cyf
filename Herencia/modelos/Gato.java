package Herencia.modelos;

public class Gato extends Animal {
    private String color;

    public Gato(){}

    public Gato(String name, int age, String color){
        super();
        this.nombre = name;
        this.edad = age;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void maulla(){
        System.out.printf("%s : Miau\n",this.nombre);
    }
    @Override
    public void comer(){
        double p = Math.random()*100;
        if(p<50){
            System.out.printf("%s te huele la mano, no le gusta lo que le das.\n",this.nombre);
        }else {
            System.out.printf("%s come lo que le das de la mano.\n",this.nombre);
            this.maulla();
        }
    }


    @Override
    public void dormir(){
        System.out.printf("%s se acomoda en tus pies haciendo el loaf perfecto y cerrando los ojos.\n",this.nombre);
    }


}
