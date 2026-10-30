import java.util.HashMap;

public class CharacterStyleFactory {

    private HashMap<String, CharacterStyle> styles = new HashMap<>();

    public CharacterStyle getFontStyle(String font, String color, int size){
        String key = font + "-" + color + "-" + size;

        if(styles.containsKey(key)){
            return styles.get(key);
        }
        else{
            CharacterStyle newStyle = new CharacterStyle(font, color, size);
            styles.put(key, newStyle);
            return newStyle;
        }
    }
}
