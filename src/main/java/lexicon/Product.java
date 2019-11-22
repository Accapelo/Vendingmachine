package lexicon;

public abstract class Product {

    private String name;
    private int price;
    private int calories;
    private String allergens;
    private int productNumber;

    public Product(String name, int price, int calories, int productNumber){
        this.name=name;
        this.price=price;
        this.calories=calories;
        this.productNumber=productNumber;
    }

    public String showProductInfo(){
        if (allergens != null) {
            return name+ ", "+price+"kr, "+calories+"c, "+allergens+".";
        }else{
            return name+ ", "+price+"kr, "+calories+"c.";
        }
    }

    public String consume(){
        return name+" was consumed.";
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public String getAllergens() {
        return allergens;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
}
