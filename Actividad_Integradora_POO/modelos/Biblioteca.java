package Actividad_Integradora_POO.modelos;

import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca implements bibliotecaInterface {
    public Libro[] array = {};
    public Biblioteca(){};
    public Biblioteca(Libro[] books){
        this.array = books;
    };
    public Libro[] getArray() {
        return array;
    }

    public void prestarLibro(Libro lib){
        String name = lib.getTitle();
        for (int i = 0; i < array.length; i++) {
            if(array[i].getTitle().equals(name)){
                array[i].setLent(true);
            }
        }
    }

    public void devolverLibro(Libro lib) {
        String name = lib.getTitle();
        for (int i = 0; i < array.length; i++) {
            if(array[i].getTitle().equals(name)){
                array[i].setLent(false);
            }
        }
    }

    public Libro leerLibro(Scanner sc){
        System.out.println("Ingrese el título, el autor, el número de páginas del libro y si está prestado:");
        String tit = sc.nextLine();
        String auth = sc.nextLine();
        int numPag = Integer.valueOf(sc.nextLine());
        boolean lent = Boolean.parseBoolean(sc.nextLine());
        return new Libro(tit,auth,numPag,lent);
    }

    public Libro buscarLibro(String title){
        for (Libro libro : this.array) {
            if(libro.getTitle().equals(title)){
                return libro;
            }
        }
        return new Libro();
    }

    @Override
    public void mostrarInfo(){
        if (this.array.length>0){
            for (Libro libro : array) {
                libro.mostrarInfo();
            }
        }else{
            System.out.println("La biblioteca está vacía.");
        }
    }

    @Override
    public void agregarLibro(Libro lib){
        int len = this.array.length;
        this.array = Arrays.copyOf(this.array, len+1);
        this.array[len] = lib;
    }
}
