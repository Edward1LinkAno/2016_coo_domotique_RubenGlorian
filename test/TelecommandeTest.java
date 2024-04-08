import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe de test permettant de tester la classe Telecommande
 */
public class TelecommandeTest {
    @Test
    public void test_ajouterLampe_TelecommandeVide(){
        //preparation
        Telecommande tel = new Telecommande() ;
        Lampe l = new Lampe("lampe") ;
        //methode a tester
        tel.ajouterLampe(l);
        //verification
        assertEquals([l],tel.getLampes(),"La liste de tel devrait monter la lampe l.");
    }
}
