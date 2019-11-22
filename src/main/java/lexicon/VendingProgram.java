package lexicon;

public class VendingProgram implements VendingMachine {

    private int depositPool = 0;
    Product[] wares = new Product[]{
            new Fruit("Banana",5,100,1),
            new Fruit("Durian",10,150,2),
            new Fruit("Avocado",15,500,3),
            new Candy("Twist",20,450,4),
            new Candy("Bars", 15, 470,5),
            new Candy("Walgens filar", 30, 200,6),
            new Drinks("Battery power",10,520,7),
            new Drinks("Mineral mix", 25,350,8),
            new Drinks("Bladgrens ice coffee",20,600,9)
    };



    @Override
    public void addCurrency(int amount) {
        int[] acceptedDeposit = {1,5,10,20,50,100,500,1000};
        boolean accepted = false;
        for (int i = 0; i < acceptedDeposit.length; i++) {
            if (amount == acceptedDeposit[i]) {
                this.depositPool += amount;
                accepted=true;
            }
        }
        if (!accepted){
            System.out.println("Invalid deposit option");
        }
    }

    @Override
    public Product request(int productNumber) {
        for(int i=0; i<wares.length;i++){
            if(wares[i].getProductNumber()==productNumber){
                if (depositPool>=wares[i].getPrice()){
                    depositPool -= wares[i].getPrice();
                    return wares[i];
                }
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int spareCash = this.depositPool;
        this.depositPool=0;
        return spareCash;
    }

    @Override
    public String getDescription(int productNumber) {
        for(int i=0; i<wares.length;i++){
            if(wares[i].getProductNumber()==productNumber){
                return wares[i].showProductInfo();
            }
        }
        return "Could not find a product with that product number.";
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public String[] getProducts() {
        String[] display = new String[9];
        for (int i = 0; i<display.length; i++){
            display[i]=wares[i].getName()+", price: "+wares[i].getPrice()+", product num: "+wares[i].getProductNumber();
        }
        return display;
    }
}
