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
        java.util.Iterator<Libro> iterator = this.myHash.iterator();
        while (iterator.hasNext()) {
            Libro lib = iterator.next();
            if(lib.getISBN()==isbn){
                this.myHash.remove(lib);
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
