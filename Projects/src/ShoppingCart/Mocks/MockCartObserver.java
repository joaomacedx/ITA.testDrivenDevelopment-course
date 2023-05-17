package ShoppingCart.Mocks;

import static org.junit.Assert.assertEquals;

import ShoppingCart.Interfaces.ICartObserver;

public class MockCartObserver implements ICartObserver {

    private String productNameReceived; 
    private int productPriceReceived;
    public MockCartObserver() {
        super();
    }

    @Override
    public void productAdded(String productName, int productPrice) {
        this.productNameReceived = productName;
        this.productPriceReceived = productPrice;
    }

    public boolean checkProductAddition(String productNameToCheck, int productPriceToCheck) {
        if(productNameToCheck.equals(productNameReceived) && productPriceToCheck == productPriceToCheck) 
            return true;
        return false;
    }

  
}