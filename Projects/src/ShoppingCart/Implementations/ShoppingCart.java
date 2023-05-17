package ShoppingCart.Implementations;

import java.util.ArrayList;
import java.util.List;

import ShoppingCart.Interfaces.ICartObserver;

public class ShoppingCart {
    
    private List<ICartObserver> observersRepository = new ArrayList<>();
    private List<Product> productsRepository = new ArrayList<Product>();
    public ShoppingCart(List<Product> productsList) {
        this.productsRepository = productsList;
    }
    public void addProduct(Product productToAdd) {
        productsRepository.add(productToAdd);
        for(ICartObserver observer: this.observersRepository){
            try{
            observer.productAdded(productToAdd.productName(), productToAdd.productPrice());
            } catch (Exception ex) {}
        }
    }
    public int totalValueOfProductsInTheCart() {
        int totalValue = 0;
        for(Product product : productsRepository) 
             totalValue += product.productPrice();
        return totalValue;
    }
    public void addObserver(ICartObserver observerToAdd) {
        this.observersRepository.add(observerToAdd);
    }
}