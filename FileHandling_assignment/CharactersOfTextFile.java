import java.io.*;

public class CharactersOfTextFile {

    public static void main(String[] args) {

        String fileName = "D:\\HeroVired.txt";
        int totalChars = 0;

        try {

            File file = new File(fileName);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);


            String line;

            while ((line = br.readLine()) != null) {
                totalChars += line.length();
            }


            br.close();
            fr.close();

            System.out.println("Total number of characters in file are: " + totalChars);

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}