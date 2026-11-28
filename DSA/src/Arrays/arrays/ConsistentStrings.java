package Arrays.arrays;

import java.util.HashSet;
import java.util.Set;

public class ConsistentStrings {

    static void main() {
        String[] words1 = {"ad","bd","aaab","baa","badab"};
        String allowed1 = "ab";
        String[] words2 = {"a","b","c","ab","ac","bc","abc"};
        String allowed2 = "abc";

        int ans1 = countConsistentStrings(allowed1,words1);
        int ans2 = countConsistentStrings(allowed2,words2);

        System.out.println("Number of consistent string in words1: " + ans1);
        System.out.println("Number of consistent string in words2: " + ans2);

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] set = new boolean[26];

        for (char c : allowed.toCharArray())
            set[c - 'a'] = true;

        int ans = 0;

        for (String word : words) {
            boolean valid = true;

            for (char c : word.toCharArray()) {
                if (!set[c - 'a']) {
                    valid = false;
                    break;
                }
            }

            if (valid) ans++;
        }

        return ans;

    }
}
                //LESS OPTIMIZED SOLUTION
//                Set<Character> set = new HashSet<>();
//                for(int k=0;k<allowed.length();k++){
//                    set.add(allowed.charAt(k));
//                }
//                int count = 0;
//                for(int i=0;i<words.length;i++){
//                    if(check(words[i],set)){
//                        count++;
//                    }
//                }
//                return count;
//            }


//            public boolean check(String s , Set<Character> c){
//            boolean ans = true;
//              for(int j=0;j<s.length();j++){
//                if(c.contains(s.charAt(j))){
//                ans  = true;
//              }
//              else{
//                return false;
//              }
//        }
//        return ans;
//}



