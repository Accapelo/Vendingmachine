package lexicon;

public interface VendingMachine {

    void addCurrency (int amount);
    Product request (int productNumber);
    int endSession();
    String getDescription(int productNumber);
    int getBalance();
    String[] getProducts();

    /*void addCurrency (int amount) - Add to the deposit pool (moneyPool).
    o Product request (int productNumber) - Buy a Product.
            o int endSession () Returns change and resets the deposit pool.
    o String getDescription (int productNumber) - View a product description.
    o Int getBalance () - Returns the deposit pool amount.
    o String [] getProducts () - Returns all Products' names and product numbers.*/

}
