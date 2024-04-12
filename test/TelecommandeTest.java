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
        assertEquals(attendu,tel.getLampes(),"La liste de tel devrait monter les lampe l et l2.");
    }

    @Test
    public void test_activerLampe_position0(){
        //preparation
        Telecommande tel = new Telecommande() ;
        Lampe l = new Lampe("lampe") ;
        tel.ajouterLampe(l);
        //methode a tester
        tel.activerLampe(0);
        //verification
        assertTrue(tel.getLampe(0).isAllume(), "La lampe en position 0 devrait être allumée.");
    }

    @Test
    public void test_activerLampe_position1(){
        //preparation
        Telecommande tel = new Telecommande() ;
        Lampe l = new Lampe("lampe") ;
        Lampe l2 = new Lampe("Lampe2") ;
        tel.ajouterLampe(l);
        tel.ajouterLampe(l2);
        //methode a tester
        tel.activerLampe(1);
        //verification
        assertTrue(tel.getLampe(1).isAllume(), "La lampe en position 1 devrait être allumée.");
    }

    @Test
    public void test_activerLampe_positionInexistante() throws Exception{
        //preparation
        Telecommande tel = new Telecommande() ;
        Lampe l = new Lampe("lampe") ;
        tel.ajouterLampe(l);
        //methode a tester et verification
        IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {tel.activerLampe(1) ;}, "La lampe en position 1 ne devrait pas exister.");
    }
}
