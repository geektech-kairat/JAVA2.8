package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Mapi mapi = new Mapi();
        HashMap<String, String[]> smallDictionary = new HashMap<>();
        smallDictionary.put("хай", new String[]{"здравствуйте", "привет", "алло"});
        smallDictionary.put("пока", new String[]{"до свидания", "прощайте"});
        smallDictionary.put("жив", new String[]{"реальный", "живой", "нетусклый "});



        Set<String> setKey = smallDictionary.keySet();
        List<String> arrayListOfSynonyms = new ArrayList<>();
        Map<String, String[]> dictionary = new HashMap<>();

        for (String key : setKey) {
            Collections.addAll(arrayListOfSynonyms, smallDictionary.get(key));
            for (int i = 0; i < arrayListOfSynonyms.size(); i++) {
                String newKey = arrayListOfSynonyms.get(i);
                //noinspection SuspiciousListRemoveInLoop
                arrayListOfSynonyms.remove(i);
                arrayListOfSynonyms.add(key);

                Object[] o = arrayListOfSynonyms.toArray();
                String[] s = new String[o.length];
                for (int j = 0; j < s.length - 1; j++) {
                    s[j] = (String) o[j];
                }

                dictionary.put(newKey, s);
                arrayListOfSynonyms.clear();
                Collections.addAll(arrayListOfSynonyms, smallDictionary.get(key));
            }
        }
        dictionary.putAll(smallDictionary);
        mapi.get(dictionary);
    }

}





