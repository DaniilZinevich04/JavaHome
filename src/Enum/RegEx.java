package Enum;

import Enum.Searching.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx implements ISearchEngine {
    public int textSearch(String text, String word) {
        int count = 0;
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count ++;
        }
        return count;
    }

    @Override
    public int search() {
        return 0;
    }
}
