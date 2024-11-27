package Actividad_Integradora_POO.modelos;

public class Libro {
    private String title;
    private String author;
    private int numPages;
    private boolean lent;
    public Libro(){}
    public Libro(String title, String author, int numPages,boolean lent){
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.lent = lent;
    }
    public boolean getLent(){
        return this.lent;
    }
    public void setLent(boolean lent){
        this.lent = lent;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void mostrarInfo(){
        System.out.printf("Titulo: %s | Autor: %s | Prestado: %s | Número de páginas: %d. \n",this.title,this.author,this.lent?"Y":"N",this.numPages);
    }
}
