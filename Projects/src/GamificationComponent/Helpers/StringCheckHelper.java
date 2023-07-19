package GamificationComponent.Helpers;

public class StringCheckHelper {
    public static boolean isEmpty(String valueToCheck) {
        if( valueToCheck == null || valueToCheck.isBlank() || valueToCheck.length() == 0)
            return true;
        return false; 

    }
}
