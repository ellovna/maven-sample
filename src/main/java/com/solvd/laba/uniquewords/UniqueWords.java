package com.solvd.laba.uniquewords;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) throws IOException {
        // create objects (files)

        File file = new File("src/main/resources/sample.txt");

        FileReader fr = null;
        BufferedReader br = null;
        // try with resources
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            String st;

            while ((st = br.readLine()) != null)
                System.out.println(st);

        } finally {
            if (br != null)
                br.close();

            if (fr != null)
                fr.close();
        }


        String str = "honda toyota mercedes mercedes toyota tesla";
        // Split string with a delimiter, which is usually a single space.
        // This returns array of words

        String[] words = str.split(" ");
        // Create a HashSet with the array of words.
        // Now, HashSet contains only unique words
        HashSet<String> uniqieWords = new HashSet<String>(Arrays.asList(words));
        /* Print the unique words */
        for(String s:uniqieWords)
            System.out.println(s);
    }
}
