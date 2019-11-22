package lexicon;
import static org.junit.Assert.*;
import org.junit.Test;


public class VendingProgramTest {

    @Test
    public void endSessionTest(){
        VendingProgram vend = new VendingProgram();
        vend.addCurrency(20);

        int moneyLeft=vend.endSession();

        assertEquals(20,moneyLeft);
        assertEquals(0,vend.getBalance());
    }

    @Test
    public void addCurrencyTest(){
        VendingProgram vend = new VendingProgram();

        vend.addCurrency(35);

        assertEquals(0,vend.getBalance());
    }

    @Test
    public void productInfoTest(){
        VendingProgram vend = new VendingProgram();

        String failedDescription = vend.getDescription(11);
        String description = vend.getDescription(3);

        assertEquals("Could not find a product with that product number.",failedDescription);
        assertEquals("Avocado, 15kr, 500c.",description);

    }

    @Test
    public void requestTest(){
        VendingProgram vend = new VendingProgram();
        vend.addCurrency(20);

        Product twist = vend.request(4);
        Product durian = vend.request(2);

        assertTrue(vend.wares[3].equals(twist));
        assertEquals(null,durian);
    }

    @Test
    public void getProductsTest(){
        VendingProgram vend = new VendingProgram();
        String expected ="Banana, price: 5, product num: 1";

        String[] arrayOfProducts = vend.getProducts();

        assertEquals(expected, arrayOfProducts[0]);
    }

}
