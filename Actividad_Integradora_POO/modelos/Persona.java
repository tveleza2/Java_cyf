package Actividad_Integradora_POO.modelos;


public class Persona extends Biblioteca{
    private String name;
    private String surname;
    public Persona(){super();};
    public Persona(String name, String surname, Libro[] array){
        super();
        this.name = name;
        this.surname = surname;
        this.array = array;
    };
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public void mostrarInfo() {
        System.out.println("Libros prestados:");
        if (this.array.length>0){
            for (Libro libro : array) {
                if (libro.getLent()){
                    libro.mostrarInfo();
                }
            }
        }else{
            System.out.println("La biblioteca está vacía.");
        }
    }

    @Override
    public void prestarLibro(Libro lib) {
        int pos = -1;
        String name = lib.getTitle();
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].getTitle().equals(name)){
                pos = i;
            }
        }
        if (pos!=-1){
            this.array[pos].setLent(true);
        }else{
            lib.setLent(true);
            super.agregarLibro(lib);
        }
        
    }

    @Override
    public void devolverLibro(Libro lib) {
        int pos = -1;
        String name = lib.getTitle();
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].getTitle().equals(name)){
                pos = i;
            }
        }
        if (pos!=-1){
            this.array[pos].setLent(false);
        }else{
            System.out.println("Libro no encontrado en el sistema");
        }
    }

}
