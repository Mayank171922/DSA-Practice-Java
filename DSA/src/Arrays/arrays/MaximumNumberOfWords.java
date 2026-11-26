package Arrays.arrays;

import java.util.Map;

public class MaximumNumberOfWords {

    static void main() {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int maximumWords = mostWordsFound(sentences);

        System.out.println(maximumWords);
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++){
            int tempMax = countWords(sentences[i]);

            max = Math.max(tempMax,max);
        }
        return max;
    }

    public static int countWords(String s){
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == ' '){
                count++;
            }
        }
        return count + 1;
    }
}
