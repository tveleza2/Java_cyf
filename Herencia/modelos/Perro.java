package Herencia.modelos;

public class Perro extends Animal {
    private String raza;

    public Perro(){}

    public Perro(String name, int age, String race){
        super();
        this.nombre = name;
        this.edad = age;
        this.raza = race;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void ladra(){
        System.out.printf("%s : WOOF WOOF\n",this.nombre);
    }

    @Override
    public void comer(){
        System.out.printf("%s se está comiendo las croquetas que le diste.\n",this.nombre);
    }
    @Override
    public void dormir(){
        System.out.printf("%s se tira un pedo y se echa en el suelo.\n",this.nombre);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){return true;}
        else{return false;}
    }
    @Override
    public int hashCode() {
        final int prime = 97;
        int result = 1 * super.hashCode();
        result = prime * result;
        return result;
    }
}
