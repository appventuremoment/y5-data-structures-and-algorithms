import java.util.*;

public class WordCount {
    private HashMap<String, Integer> dictionary;

    // Populates the dictionary by reading the text in the file called filename
    // All words are stored in lowercase with no punctuation or spaces
    // Hint: Use regex to remove the punctuation from all words
    public WordCount(String filename){
        // Complete the code below this comment

    }

    // Returns the count for a given word
    // If the word cannot be found, return 0
    public int getCount(String word){
        // Complete the code below this comment
        return 0;
    }

    // Returns true if the dictionary has the word, false otherwise
    public boolean hasWord(String word){
        // Complete the code below this comment
        return false;
    }

    // Returns the word with the maximum count in the dictionary
    public String getWordWithMaxCount(){
        // Complete the code below this comment
        return null;
    }

    // Returns an ArrayList of Strings of all unique words in the story.
    public ArrayList<String> getAllUniqueWords(){
        // Complete the code below this comment
        return null;
    }

    @Override
    public String toString(){
        return dictionary.toString();
    }
}