package lexicon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrinksTest {

    @Test
    public void consumeDrinkTest(){
        Drinks hotChocolate = new Drinks("Hot Chocolate",10,100,3);

        String eat = hotChocolate.consume();

        assertEquals("Hot Chocolate was consumed.", eat);
    }

    @Test
    public void showInfoDrinkTest(){
        Drinks hotChocolate = new Drinks("Hot Chocolate",10,100,3);

        String eat = hotChocolate.showProductInfo();

        assertEquals("Hot Chocolate, 10kr, 100c.", eat);
    }
}
