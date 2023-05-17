package ShoppingCart.Interfaces;

public interface ICartObserver {
  
    public void productAdded(String productName, int productPrice);
}