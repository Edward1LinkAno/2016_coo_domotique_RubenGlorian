public class Television {
    private int son = 0;
    
    public void allumer() {
        this.son += 10;
        // son maximum
        if (this.son > 100)
            this.son = 100;
    }

    public void eteindre() {
        this.son = 0;

    }

    public String toString() {
        String r = "";
        r += "Hifi:" + son;
        return (r);
    }
}
