package HashSets.modelos;

public class Libro {
    private String title;
    private String author;
    private int ISBN;

    public Libro(){}
    public Libro(String aut, int isbn, String tit){
        this.title = tit;
        this.author = aut;
        this.ISBN = isbn;
    }


    public String getAuthor() {
        return author;
    }
    public int getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String showBook(){
        return String.format("[%s , %d , %s]", this.author,this.ISBN,this.title);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Libro l){
            return (this.getISBN() == l.getISBN());
        }else{
            return false;
        }
    }

}
