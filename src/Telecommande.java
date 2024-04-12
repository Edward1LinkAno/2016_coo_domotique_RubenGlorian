import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes ;

    public Telecommande(){
        this.lampes = new ArrayList<>() ;
    }

    public void ajouterLampe(Lampe lampe){
        this.lampes.add(lampe) ;
    }

    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer() ;
    }

    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre() ;
    }

    public void activerTout(){
        for (Lampe l : this.lampes) {
            l.allumer();
        }
    }

    @Override
    public String toString() {
        String s = "Lampes :\n" ;
        for (Lampe l : this.lampes) {
            s += l.toString()+"\n" ;
        }
        return s ;
    }

    public ArrayList<Lampe> getLampes() {
        return this.lampes;
    }

    public Lampe getLampe(int pos){
        return this.lampes.get(pos) ;
    }
}
