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
        assertTrue("somma corretta",calcolatrice.prodotto(3,3)==9);
    }

}
