package wddbyui.cit260.hangman.words;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author gerrygj
 */

//converted to super-class by Gerald for Lesson 9
public class FileArrayProvider implements Serializable {

    public String[] wordList = null;
    public String fileName = null;
    
    public FileArrayProvider() {
    }
    
    public FileArrayProvider(String fileName) {
        this();
        this.fileName = fileName;
    }

    public void readLines() throws IOException {
        FileReader fileReader = new FileReader(fileName);
        List<String> lines;
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            lines = new ArrayList<>();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
        }
        wordList = lines.toArray(new String[lines.size()]);
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
