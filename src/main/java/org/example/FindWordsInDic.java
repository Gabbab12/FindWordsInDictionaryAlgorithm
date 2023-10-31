package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindWordsInDic{
    public static String findWords(String[] arr){
        Map<String, Boolean> keywords = new HashMap<>();
        String sequence = arr[0];
        String dictionary = arr[1];
        for(String key : dictionary.split(",")){
            keywords.put(key, true);
        }
        for (int i = 0; i < sequence.length(); i++){
            String firstSplitWord = sequence.substring(0, i);
            String secondSplitWord = sequence.substring(i);

            if (keywords.containsKey(firstSplitWord) && keywords.containsKey(secondSplitWord)){
                return firstSplitWord + (",") + secondSplitWord;
            }
        }
        return "The values is not having a matched words, please check again.";
    }
    public static void main(String[] args){
        String[] value = {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        String result = findWords(value);
        System.out.println(result);

        String[] value2 = {"HelloWorld", "a,all,b,ball,bas,base,cat,Hello,code,d,e,quit,z"};
        String result2 = findWords(value2);
        System.out.println(result2);
    }
}
