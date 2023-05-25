package com.solvd.laba.uniquewords;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class UniqueWords2 {
    public static void main(String[] args) throws IOException {
        // read text from input file
        File file = new File("src/main/resources/sample.txt");
        String text = FileUtils.readFileToString(file, "UTF-8");

        // split text into words and count frequency of each word using a HashMap
        // to know how many words
        String[] words = StringUtils.split(text.toLowerCase(), " ,.!?:;");
        HashMap<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        // count number of unique words
        int uniqueWords = counts.size();

        // write result to output file
        File output = new File("src/main/resources/result.txt\"");
        String result = "Number of unique words: " + uniqueWords + "\n";
        for (String word : counts.keySet()) {
            result += word + ": " + counts.get(word) + "\n";
        }
        FileUtils.writeStringToFile(output, result, "UTF-8");
        System.out.println("The unique words are printed! Please, check the 'results' file");
    }
}

