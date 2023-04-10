package CamelCase.Implementation;

import java.util.ArrayList;
import java.util.List;

public class CamelCase {
   public CamelCase() {}

    public static List<String> toTransform(String value) {
        List<String> list = new ArrayList<String>();
        list.add(value);
        return list;
    }
    
}