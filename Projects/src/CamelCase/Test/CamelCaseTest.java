package CamelCase.Test;

import org.junit.Test;

import CamelCase.Implementation.CamelCase;

public class CamelCaseTest {
    
    @Test
    public void transformSimpleString() {
        CamelCase camelCase = new CamelCase();
        camelCase.toTransform("nome");
    }
}