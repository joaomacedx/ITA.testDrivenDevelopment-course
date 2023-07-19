package GamificationComponent.Helpers;

public class IntegerCheckHelper {
    
    public static boolean isEmpty(int valueToCheck) {
        if(valueToCheck == 0 || valueToCheck < 0)
            return true;
        return false;
    }
}
