package CamelCase.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import CamelCase.Implementation.CamelCase;

public class CamelCaseTest {
    
    @Test
    public void checkConvertStringToList() {
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("nome");
        List<String> receivedList = CamelCase.toTransform("nome");
        assertEquals(expectedList, receivedList);
    }
    @Test 
    public void checkCompoundName() { 
     List<String> expectedList = new ArrayList<String>();
     expectedList.add("nome");
     expectedList.add("Composto");
     List<String> receivedList = CamelCase.toTransform("nomeComposto");
     assertEquals(expectedList, receivedList);
    }

}