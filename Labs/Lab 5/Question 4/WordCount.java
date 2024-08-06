import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class WordCount {
    private HashMap<String, Integer> dictionary;

    // Populates the dictionary by reading the text in the file called filename
    // All words are stored in lowercase with no punctuation or spaces
    // Hint: Use regex to remove the punctuation from all words
    public WordCount(String filename){
        String temp = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                temp += line + " ";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        temp = temp.replaceAll("[;,'.]", "");
        dictionary = new HashMap<>();
        for (String s: temp.split(" ")) {
            dictionary.put(s.toLowerCase(), dictionary.getOrDefault(s.toLowerCase(), 0) + 1);
        }
    }

    // Returns the count for a given word
    // If the word cannot be found, return 0
    public int getCount(String word){
        if (hasWord(word)) return dictionary.get(word);
        else return 0;
    }

    // Returns true if the dictionary has the word, false otherwise
    public boolean hasWord(String word){
        return dictionary.containsKey(word);
    }

    // Returns the word with the maximum count in the dictionary
    public String getWordWithMaxCount(){
        String ret = null;
        int maxi = 0;

        for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
            if (entry.getValue() > maxi) {
                maxi = entry.getValue();
                ret = entry.getKey();
            }
        }
        return ret;
    }

    // Returns an ArrayList of Strings of all unique words in the story.
    public ArrayList<String> getAllUniqueWords() {
        ArrayList temp = new ArrayList<>(dictionary.keySet());
        Collections.sort(temp);
        return temp;
    }

    @Override
    public String toString(){
        return dictionary.toString();
    }
}