package Pruebas_parametrizadas;

public class randGen {
    // Clase que calcula un número aleatorio dentro del rango [1,355]
    public static void main(String[] args) {
        numeroAleatorio();
    }
    public static void numeroAleatorio(){
        double f = Math.random()/Math.nextDown(1.0);
        double x = 354*f+1;
        int num = (int) (x);
        System.out.println(num);
    }
}
