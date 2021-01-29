package com.company;

import java.util.*;


public class Mapi {
    public void get(Map<String, String[]> map) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Tape a word:");
            String word = scanner.next().toLowerCase(Locale.ROOT);
            if (map.containsKey(word)) {
                String[] synonyms = map.get(word);
                Random random = new Random();
                int index = random.nextInt(synonyms.length);
                System.out.println(synonyms[index]);

            } else {
                System.out.println("There is no such word");

            }

        }



    }
}
