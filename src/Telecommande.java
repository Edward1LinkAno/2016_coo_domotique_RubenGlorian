import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes ;

    public Telecommande(){
        this.lampes = new ArrayList<>() ;
    }

    public void ajouterLampe(Lampe lampe){
        throw new Error("code non écrit") ;
    }

    public void activerLampe(int indiceLampe){
        throw new Error("code non écrit") ;
    }

    public void desactiverLampe(int indiceLampe){
        throw new Error("code non écrit") ;
    }

    public void activerTout(){
        throw new Error("code non écrit") ;
    }

    @Override
    public String toString() {
        throw new Error("code non écrit") ;
    }

    public ArrayList<Lampe> getLampes() {
        return this.lampes;
    }

    public Lampe getLampe(int pos){
        return this.lampes.get(pos) ;
    }
}
