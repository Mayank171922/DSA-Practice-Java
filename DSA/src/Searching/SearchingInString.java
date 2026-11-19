package Searching;

import java.util.Scanner;

public class SearchingInString {
    static void main() {
        String name = "Mayank";
        char alpha = 'k';
        boolean result = search(name,alpha);
        System.out.println(result);
    }

    static boolean search(String s,char c){
        if(s.length()==0){
            return false;
        }
        for(char t : s.toCharArray()){
            if(t == c){
                return true;
            }
        }
        return false;
    }
}
