package Translator.Test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Translator.Implementation.Translator;


public class TranslatorTest { 
    private Translator translator;

    @Before
    public void initTranslator() {
        this.translator = new Translator();
    }

    @Test
    public void checkTranslatorWithoutWords() {
        assertTrue(this.translator.isEmpty());
    }
    @Test
    public void checkTranslation() {
        this.translator.addWordTranslation("bom", "good");
        assertFalse(this.translator.isEmpty());
        assertEquals("good", this.translator.translate("bom"));
    }
    @Test
    public void checkTwoTranslations() {
        this.translator.addWordTranslation("bom", "good");
        this.translator.addWordTranslation("mau", "bad");
        assertEquals("good", this.translator.translate("bom"));
        assertEquals("bad", this.translator.translate("mau"));
    }
    @Test
    public void checkTwoTranslationsForTheSameWord() {
        this.translator.addWordTranslation("bom", "good");
        this.translator.addWordTranslation("bom", "nice");
        assertEquals("good, nice", this.translator.translate("bom"));
    }

}