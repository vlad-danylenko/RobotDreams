package src.collections3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("hi_ukr","Привіт");
        hashMap.put("hi_en","Hello");

        System.out.println(hashMap);

        for (Map.Entry<String, String> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        countWords("test is test in only test is");
    }

    private static Map<String, Integer> countWords(String text) {

        String[] words = text.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word,0) + 1);
        }
        System.out.println(wordCount);
        return wordCount;
    }
}
