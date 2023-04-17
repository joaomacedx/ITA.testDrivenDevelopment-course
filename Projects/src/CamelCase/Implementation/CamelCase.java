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
        if(hasEspecialCharacteres(value)) throw new HasEspecialCharCamelCaseException("String cannot start with especial characteres");
        list.add(value);
        return list;
    }
    private static boolean isEmpty(String value) {
        if(value == null || value.length() == 0 || value == " ") return true;
        return false;
    }
    private static boolean initWithNumber(String value) {
       if(value.substring(0).matches("[0-9].*")) return true;
       return false;
    }
    private static boolean hasEspecialCharacteres(String value) {
        if(value.substring(0).matches("[çÇ$&+,:;=?@#|'<>.^*()%!-].*")) return true;
        return false;
    }
}