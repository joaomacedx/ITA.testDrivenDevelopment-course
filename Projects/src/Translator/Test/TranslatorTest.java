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
    @Test
    public void checkTranslateSentence() {
        this.translator.addWordTranslation("guerra", "war");
        this.translator.addWordTranslation("é", "is");
        this.translator.addWordTranslation("ruim", "bad");
        assertEquals("war is bad", this.translator.translateSentence("guerra é ruim"));
    }
    @Test
    public void checkTranslateSentenceWithTwoTranslationsForTheSameWord() {
        this.translator.addWordTranslation("paz", "peace");
        this.translator.addWordTranslation("é", "is");
        this.translator.addWordTranslation("bom", "good");
        this.translator.addWordTranslation("bom", "nice");
        assertEquals("peace is good", this.translator.translateSentence("paz é bom"));
    }

}