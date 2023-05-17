package ShoppingCart.Mocks;

import ShoppingCart.Interfaces.ICartObserver;

public class MockCartObserverWithProblem implements ICartObserver{

    @Override
    public void productAdded(String productName, int productPrice) {
    
        throw new RuntimeException("Problem simulated by mock");
    }

}
