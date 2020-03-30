package Enum.Searching;

public class EasySearch implements ISearchEngine {
    private int box;
    @Override
    public int search(String strin, String word) {
            int position = strin.indexOf(word);
            while (position != -1){
                    box++;
                    position =strin.indexOf(word,position + 1);
                }

            return box ;
    }
}
