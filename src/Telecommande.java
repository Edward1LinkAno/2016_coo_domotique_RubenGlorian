import java.util.ArrayList;

public class Telecommande {
    private ArrayList<Appareils> appareils ;

    public Telecommande(){
        this.appareils = new ArrayList<>() ;
    }

    public void ajouterAppareil(Appareils appareil){
        this.appareils.add(appareil) ;
    }

    public void activerAppareil(int indiceAppareil){
        this.appareils.get(indiceAppareil).allumer() ;
    }

    public void desactiverAppareil(int indiceAppareil){
        this.appareils.get(indiceAppareil).eteindre() ;
    }

    public void activerTout(){
        for (Appareils a : this.appareils) {
            a.allumer();
        }
    }

    @Override
    public String toString() {
        String s = "Lampes :\n" ;
        for (Appareils a : this.appareils) {
            s += a.toString()+"\n" ;
        }
        return s ;
    }

    public ArrayList<Appareils> getAppareils() {
        return this.appareils;
    }

    public Appareils getAppareil(int pos){
        return this.appareils.get(pos) ;
    }
}
