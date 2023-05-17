package ShoppingCart.Implementations;

import java.util.ArrayList;
import java.util.List;

import ShoppingCart.Interfaces.ICartObserver;

public class ShoppingCart {
    
    private ICartObserver observer;
    private List<Product> productsRepository = new ArrayList<Product>();
    public ShoppingCart(List<Product> productsList) {
        this.productsRepository = productsList;
    }
    public void addProduct(Product productToAdd) {
        productsRepository.add(productToAdd);
        if(observer!= null) this.observer.productAdded(productToAdd.productName(), productToAdd.productPrice());
    }
    public int totalValueOfProductsInTheCart() {
        int totalValue = 0;
        for(Product product : productsRepository) 
             totalValue += product.productPrice();
        return totalValue;
    }
    public void addObserver(ICartObserver observerToAdd) {
        this.observer = observerToAdd;
    }
}