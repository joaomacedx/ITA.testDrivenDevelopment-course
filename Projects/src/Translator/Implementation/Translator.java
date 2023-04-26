package Translator.Implementation;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private Map<String,String> translations = new HashMap<>();

    public boolean isEmpty() {
        if(this.translations.isEmpty()) return true;
        return false;
    }

    public void addWordTranslation(String word, String translation) {
        this.translations.put(word, translation);
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

}