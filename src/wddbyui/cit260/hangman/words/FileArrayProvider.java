package wddbyui.cit260.hangman.words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import wddbyui.cit260.hangman.enums.ErrorType;

/**
 *
 * @author gerrygj
 */

public class FileArrayProvider implements Serializable {

    public String[] wordList = null;
    public String fileName = null;
    
    public FileArrayProvider() {
    }
    
    public FileArrayProvider(String fileName) {
        this();
        this.fileName = fileName;
    }

    public void readLines() throws FileNotFoundException, IOException {
        FileReader fileReader;
        try {
            fileReader = new FileReader(fileName);
            List<String> lines;
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            lines = new ArrayList<>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        
            wordList = lines.toArray(new String[lines.size()]);
        }
        catch (FileNotFoundException e) {
            System.out.println(ErrorType.MISSING_FILE.getMessage());
            //Logger.getLogger(FileArrayProvider.class.getName()).log(Level.SEVERE, null, e);   // use for testing
        }
        catch (IOException e) { //Gerald, Lesson 11 Individual
            System.out.println(ErrorType.INCORRECT_FILE.getMessage());
            //Logger.getLogger(FileArrayProvider.class.getName()).log(Level.SEVERE, null, e);   // use for testing
        }
    }
    
    public void randomizeList() throws IOException {
        // Implementing Fisher–Yates shuffle
        this.readLines();
        Random rnd = new Random();
        for (int i = 0; i < wordList.length-1; i++) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = wordList[index];
            wordList[index] = wordList[i];
            wordList[i] = a;
        }
    }
}
