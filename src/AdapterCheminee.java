public class AdapterCheminee implements Appareils {

    private Cheminee cheminee ;

    public AdapterCheminee(){
        this.cheminee = new Cheminee() ;
    }

    @Override
    public void allumer() {
        ...
    }

    @Override
    public void eteindre() {
        this.cheminee
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
