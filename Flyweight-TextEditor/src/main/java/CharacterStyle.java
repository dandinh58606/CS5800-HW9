public class CharacterStyle {

    private final String font;
    private final String color;
    private final int size;

    public CharacterStyle(String fontstyle, String fontcolor, int fontsize){
        this.font = fontstyle;
        this.color = fontcolor;
        this.size = fontsize;
    }

    public String getFont(){
        return font;
    }

    public String getColor(){
        return color;
    }

    public int getSize(){
        return size;
    }

}
