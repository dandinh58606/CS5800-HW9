import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Document {

    private List<Character> characters = new ArrayList<>();
    private CharacterStyleFactory styleFactory = new CharacterStyleFactory();

    public void addCharacter(char c, String fontStyle, String fontColor, int fontSize){
        CharacterStyle style = styleFactory.getFontStyle(fontStyle, fontColor, fontSize);

        Character character = new Character(c, style);

        characters.add(character);
    }

    public void printDoc(){
        for(Character character : characters){
            character.print();
        }
    }

    public void saveToFile(String fileName){
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for(Character ch : characters){
                CharacterStyle style = ch.getFontStyle();
                writer.println(ch.getSymbol() + "," + style.getFont() + "," + style.getColor() + "," + style.getSize());
            }
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public void loadFile(String fileName){
        characters.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length == 4){
                    char symbol = parts[0].charAt(0);
                    String font = parts[1];
                    String color = parts[2];
                    int size = Integer.parseInt(parts[3]);

                    addCharacter(symbol, font, color, size);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

}
