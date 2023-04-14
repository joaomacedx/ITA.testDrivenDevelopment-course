package CamelCase.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import CamelCase.Implementation.CamelCase;
import CamelCase.Exception.*;

public class CamelCaseTest {
    
    @Test
    public void checkConvertSimpleStringToList() {
        List<String> expectedList = new ArrayList<String>();
        expectedList.add("nome");
        List<String> receivedList = CamelCase.toTransform("nome");
        assertEquals(expectedList, receivedList);
    }
    @Test (expected = EmptyStringCamelCaseException.class)
    public void checkEmptyString() { 
     List<String> expectedList = new ArrayList<String>();
     List<String> receivedList = CamelCase.toTransform(" ");
     assertEquals(expectedList, receivedList);
    }
    @Test(expected = InitWithNumberCamelCaseExeception.class)
    public void checkInitWithNumber() { 
        List<String> list = CamelCase.toTransform("10Primeiros");
    }
    @Test(expected = InitWithEspecialCharCamelCaseException.class)
    public void checkInitWithEspecialCharacteres() {
        List<String> list = CamelCase.toTransform("#nome");
    }

}