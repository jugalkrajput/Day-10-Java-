package com.revision;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "java is fun and java is powerful and java is everywhere";
        
        // Split into words (convert to lowercase to treat "Java" and "java" as same)
        String[] words = sentence.toLowerCase().split(" ");
        
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            // If word already exists, increment count
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        
        // Print frequency
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}