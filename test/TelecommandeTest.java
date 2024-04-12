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
        ArrayList<Lampe> attendu = new ArrayList<>() ;
        attendu.add(l) ;
        //methode a tester
        tel.ajouterLampe(l);
        //verification
        assertEquals(attendu,tel.getLampes(),"La liste de tel devrait monter la lampe l.");
    }

    @Test
    public void test_ajouterLampe_TelecommandeNonVide(){
        //preparation
        Telecommande tel = new Telecommande() ;
        Lampe l = new Lampe("lampe") ;
        Lampe l2 = new Lampe("Lampe2") ;
        ArrayList<Lampe> attendu = new ArrayList<>() ;
        attendu.add(l2) ;
        attendu.add(l) ;
        tel.ajouterLampe(l2) ;
        //methode a tester
        tel.ajouterLampe(l);
        //verification
        assertEquals(attendu,tel.getLampes(),"La liste de tel devrait monter la lampe l.");
    }

    @Test
    public void test_activerLampe_position0(){
        //preparation
        Telecommande tel = new Telecommande() ;
        Lampe l = new Lampe("lampe") ;
        tel.ajouterLampe(l);
        //methode a tester
        tel.ajouterLampe(l);
        //verification
        assertTrue(tel.getLampe(0).isAllume(), "La liste de tel devrait monter la lampe l.");
    }

    @Test
    public void test_activerLampe_position0(){
        //preparation
        Telecommande tel = new Telecommande() ;
        Lampe l = new Lampe("lampe") ;
        tel.ajouterLampe(l);
        //methode a tester
        tel.ajouterLampe(l);
        //verification
        assertTrue(tel.getLampe(0).isAllume(), "La liste de tel devrait monter la lampe l.");
    }
}
