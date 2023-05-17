package ShoppingCart.Implementations;

public class Product {
    private String name;
    private int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int productPrice() {
        return price;
    }
    public String productName() {
        return name;
    }

}
