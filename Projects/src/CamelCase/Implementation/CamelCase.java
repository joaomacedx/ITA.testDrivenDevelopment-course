package CamelCase.Implementation;

import java.util.ArrayList;
import java.util.List;

import CamelCase.Exception.EmptyStringCamelCaseException;


public class CamelCase {
   public CamelCase() {}

    public static List<String> toTransform(String value) {
        List<String> list = new ArrayList<String>();
        if(isEmpty(value)) throw new EmptyStringCamelCaseException("This string is null or empty");
        list.add(value);
        return list;
    }
    private static boolean isEmpty(String value) {
        if(value == null || value.length() == 0 || value == " ") return true;
        return false;
    }
}