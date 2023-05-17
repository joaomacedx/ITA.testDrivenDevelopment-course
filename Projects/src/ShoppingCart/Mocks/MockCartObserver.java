package ShoppingCart.Mocks;

import ShoppingCart.Interfaces.ICartObserver;

public class MockCartObserver implements ICartObserver {

    private String productNameReceived; 
    private int productPriceReceived;
    private Boolean throwException = false;
    public MockCartObserver() {
        super();
    }

    @Override
    public void productAdded(String productName, int productPrice) {
        if(this.throwException) throw new RuntimeException("Exception simulated by mock");
        this.productNameReceived = productName;
        this.productPriceReceived = productPrice;
    }

    public boolean checkProductAddition(String productNameToCheck, int productPriceToCheck) {
        if(productNameToCheck.equals(productNameReceived) && productPriceToCheck == productPriceReceived) 
            return true;
        return false;
    }

    public void throwException() {
        this.throwException = true;
    }

  
}