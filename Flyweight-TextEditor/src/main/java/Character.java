public class Character {

    private char symbol;
    private CharacterStyle fontStyle;

    public Character(char charactersymbol, CharacterStyle style){
        this.symbol = charactersymbol;
        this.fontStyle = style;
    }

    public char getSymbol(){
        return symbol;
    }

    public CharacterStyle getFontStyle(){
        return fontStyle;
    }

    public void print(){
        System.out.println("Character: " + symbol +
        "[Font: " + fontStyle.getFont() + ", Color: " + fontStyle.getColor() +
        ", Size: " + fontStyle.getSize());
    }
}
