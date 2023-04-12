package CamelCase.Implementation;

import java.util.ArrayList;
import java.util.List;

import CamelCase.Exception.*;


public class CamelCase {
   public CamelCase() {}

    public static List<String> toTransform(String value) {
        List<String> list = new ArrayList<String>();
        if(isEmpty(value)) throw new EmptyStringCamelCaseException("This string is null or empty");
        if(initWithNumber(value)) throw new InitWithNumberCamelCaseExeception("String cannot start with numbers");
        list.add(value);
        return list;
    }
    private static boolean isEmpty(String initialValue) {
        if(initialValue == null || initialValue.length() == 0 || initialValue == " ") return true;
        return false;
    }
    private static boolean initWithNumber(String initialValue) {
       if(initialValue.substring(0).matches("[0-9].*")) return true;
       return false;
    }
}