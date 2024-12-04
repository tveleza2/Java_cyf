package HashSets.modelos;
import java.util.HashSet;

public class RegistroDeInvitados {
    private HashSet<String> myHash = new HashSet<>();
    public RegistroDeInvitados(){}
    public RegistroDeInvitados(HashSet<String> aHash){
        this.myHash = aHash;
    }

    public void agregarInvitado(String name){
        this.myHash.add(name);
    }
    public void eliminarInvitado(String name){
        this.myHash.remove(name);
    }
    public void mostrarInvitados(){
        System.out.println(this.myHash.toString());
    }
}
