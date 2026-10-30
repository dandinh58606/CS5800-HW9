public class Driver {

    public static void main(String[] args){
        Document doc = new Document();

        String text = "HelloWorldCS5800";

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            int styleNum = i % 4;

            switch(styleNum){
                case 0:
                    doc.addCharacter(c, "Arial", "Blue", 12);
                    break;
                case 1:
                    doc.addCharacter(c, "Calibri", "Black", 14);
                    break;
                case 2:
                    doc.addCharacter(c, "Verdana", "Red", 16);
                    break;
                case 3:
                    doc.addCharacter(c, "Times New Roman", "Blue", 14);
                    break;
            }
        }

        System.out.println("---- Document ----");
        doc.printDoc();

        doc.saveToFile("document.txt");

    }

}
