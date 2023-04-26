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
        translator.addWordTranslation("bom", "good");
        assertFalse(translator.isEmpty());
        assertEquals("good", translator.translate("bom"));
    }
    @Test
    public void checkTwoTranslations() {
        Translator translator = new Translator();
        translator.addWordTranslation("bom", "good");
        translator.addWordTranslation("mau", "bad");
        assertEquals("good", translator.translate("bom"));
        assertEquals("bad", translator.translate("mau"));
    }

}