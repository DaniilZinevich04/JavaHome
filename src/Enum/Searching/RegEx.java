package Enum.Searching;

import Enum.Searching.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx implements ISearchEngine {

    @Override
    public int search(String strin, String word) {
        int count = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(strin);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
