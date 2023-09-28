import org.example.Calcolatrice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalcolatricceTest {
    Calcolatrice calcolatrice;

    @Before
    public final void CreazioneTest(){
        calcolatrice= new Calcolatrice(3,3);
    }

    @Test
    public void SommaTest(){
        assertTrue("somma corretta",calcolatrice.somma(3,3)==6);
    }

    @Test
    public void ProdottoTest(){
        assertTrue("prodotto corretto",calcolatrice.prodotto(3,3)==9);
    }
    
    @Test
    public void DivisioneTest(){
        assertTrue("divisione corretta",calcolatrice.divisione(6,3)==2);
    }

    @Test
    public void SottrazioneTest(){
        assertTrue("sottrazione corretta",calcolatrice.sottrazione(3,3)==0);
    }

}
