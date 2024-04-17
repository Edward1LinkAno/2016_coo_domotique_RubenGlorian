public class AdapterCheminee implements Appareils {

    private Cheminee cheminee ;

    public AdapterCheminee(){
        this.cheminee = new Cheminee() ;
    }

    @Override
    public void allumer() {
        this.cheminee.changerIntensite(this.cheminee.getLumiere()+10);
    }

    @Override
    public void eteindre() {
        this.cheminee.changerIntensite(0) ;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
