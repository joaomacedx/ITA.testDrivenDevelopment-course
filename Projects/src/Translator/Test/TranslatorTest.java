package Translator.Test;
import static org.junit.Assert.*;

import org.junit.Test;

import Translator.Implementation.Translator;


public class TranslatorTest { 

    @Test
    public void checkTranslatorWithoutWords() {
        Translator translator = new Translator();
        assertTrue(translator.isEmpty());
    }

}