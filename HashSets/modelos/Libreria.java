package HashSets.modelos;

import java.util.HashSet;

public class Libreria {
    private HashSet<Libro> myHash = new HashSet<>();
    public Libreria(){}
    public Libreria(HashSet<Libro> aHash){
        this.myHash = aHash;
    }
    public void agregarLibro(Libro book){
        this.myHash.add(book);
    }
    public void agregarLibro(String aut, int isbn, String tit){
        this.myHash.add(new Libro(aut,isbn,tit));
    }
    public void eliminarLibro(int isbn){
        for (Libro libro : myHash) {
            if(libro.getISBN()==isbn){
                this.myHash.remove(libro);
                break;
            }
        }
        
    }

    public void mostrarCatalogo(){
        System.out.println("[Autor , ISBN , Título]");
        for (Libro libro : myHash) {
            System.out.println(libro.showBook());
        }
        
    }
}
