package lexicon;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CandyTest {

    @Test
    public void consumeCandyTest(){
        Candy chocolate = new Candy("Chocolate",50,1000,5);

        String eat = chocolate.consume();

        assertEquals("Chocolate was consumed.", eat);
    }

    @Test
    public void showInfoCandyTest(){
        Candy chocolate = new Candy("Chocolate",50,1000,5);

        String eat = chocolate.showProductInfo();

        assertEquals("Chocolate, 50kr, 1000c.", eat);
    }

}
