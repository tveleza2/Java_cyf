package Encapsulamiento_Ocultamiento.modelos;

public class triangulo {
    private float base;
    private float alto;
    
    public triangulo(float base,float alto){
        this.base = base;
        this.alto = alto;
    }
    public triangulo(){}

    public float getBase(){
        return this.base;
    }
    public void setBase(float base){
        this.base = base;
    }
    public float getAlto(){
        return this.alto;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }

    public float area(){
        return alto*base/2;
    }

    public void showFeatures(){
        System.out.printf("El área del triángulo es %.2f. \n",area());
    }
}
