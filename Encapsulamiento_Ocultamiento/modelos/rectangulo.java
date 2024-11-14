package Encapsulamiento_Ocultamiento.modelos;

public class rectangulo {
    private float alto;
    private float ancho;
    
    public rectangulo(float alto,float ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    public rectangulo(){}

    public float getAlto(){
        return this.alto;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }
    public float getAncho(){
        return this.ancho;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }

    public float area(){
        return alto*ancho;
    }
    public float perimetro(){
        return (2*alto)+(2*ancho);
    }

    public void showFeatures(){
        System.out.printf("El área del rectángulo es %.2f y el perímetro es %.2f. \n",area(),perimetro());
    }
}
