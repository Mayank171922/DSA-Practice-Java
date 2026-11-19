package Searching;

import java.util.Arrays;

public class SearchInString {
    static void main() {
        String name = "Mayank";
        char alpha = 'M';
        boolean result = search(name , alpha);
        System.out.println(result);
        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search(String s , char c){
        if(s.length()==0){
            return false;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == c){
                return true;
            }
        }
        return false;
    }
}
