import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Lampe> lampes ;
    private ArrayList<Hifi> hifis ;

    public Telecommande(){
        this.lampes = new ArrayList<>() ;
        this.hifis = new ArrayList<>() ;
    }

    public void ajouterLampe(Lampe lampe){
        this.lampes.add(lampe) ;
    }

    public void ajouterHifi(Hifi hifi){
        this.hifis.add(hifi) ;
    }

    public void activerLampe(int indiceLampe){
        this.lampes.get(indiceLampe).allumer() ;
    }

    public void activerHfi(int indiceHifi){
        this.hifis.get(indiceHifi).allumer() ;
    }

    public void desactiverLampe(int indiceLampe){
        this.lampes.get(indiceLampe).eteindre() ;
    }

    public void desactiverHifi(int indiceHifi){
        this.hifis.get(indiceHifi).eteindre() ;
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
