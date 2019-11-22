package lexicon;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FruitTest {

    @Test
    public void consumeFruitTest(){
        Fruit durian = new Fruit("Durian",30,300,1);

        String eat = durian.consume();

        assertEquals("Durian was consumed.", eat);
    }

    @Test
    public void showInfoFruitTest(){
        Fruit durian = new Fruit("Durian",30,300,1);

        String eat = durian.showProductInfo();

        assertEquals("Durian, 30kr, 300c.", eat);
    }

}
