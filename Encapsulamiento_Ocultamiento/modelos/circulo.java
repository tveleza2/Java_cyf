package Encapsulamiento_Ocultamiento.modelos;

public class circulo {
    private float radius;
    
    public circulo(float radius){
        this.radius = radius;
    }
    public circulo(){}

    public float getRadius(){
        return this.radius;
    }
    public void setRadius(float radius){
        this.radius = radius;
    }

    public float area(){
        return (float)Math.PI*radius*radius;
    }

    public void showFeatures(){
        System.out.printf("El área del círculo es %.2f. \n",area());
    }
}
