package Translator.Implementation;


public class Translator {

    private String translation;

    public boolean isEmpty() {
        if(this.translation == null) return true;
        return false;
    }

    public void addWord(String word, String translation) {
        this.translation = translation;
    }

    public String translate(String word) {
        return this.translation;
    }

}