import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes ;

    public Telecommande(){
        this.lampes = new ArrayList<Lampe>() ;
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
}
