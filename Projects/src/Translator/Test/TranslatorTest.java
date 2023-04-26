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
    @Test
    public void checkTranslation() {
        Translator translator = new Translator();
        translator.addWord("bom", "good");
        assertFalse(translator.isEmpty());
        assertEquals("good", translator.translate("bom"));
    }

}