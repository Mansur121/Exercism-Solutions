import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        // throw new UnsupportedOperationException("Please implement the isEmpty() method");
        return languages.size()==0?true:false;
    }

    public void addLanguage(String language) {
        // throw new UnsupportedOperationException("Please implement the addLanguage() method");
        languages.add(language);
    }

    public void removeLanguage(String language) {
        // throw new UnsupportedOperationException("Please implement the removeLanguage() method");
        languages.remove(language);
    }

    public String firstLanguage() {
        // throw new UnsupportedOperationException("Please implement the firstLanguage() method");
        return languages.get(0);
    }

    public int count() {
        // throw new UnsupportedOperationException("Please implement the count() method");
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        // throw new UnsupportedOperationException("Please implement the containsLanguage() method");
        if(languages.contains(language))return true;
        return false;
    }

    public boolean isExciting() {
        // throw new UnsupportedOperationException("Please implement the isExciting() method");
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
