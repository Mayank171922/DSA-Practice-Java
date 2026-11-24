package Searching;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatching {
    static void main() {


        List<List<String>> items = new ArrayList<>();

        items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
        items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
        items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));
        items.add(new ArrayList<>(List.of("computer", "pink", "phone")));

        //System.out.println(items);
        String ruleKey = "color";
        String ruleValue = "silver";

        int ans = countMatches(items,ruleKey,ruleValue);
        System.out.println(ans);


    }
        public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        int index = 0;

        if(ruleKey.equals("typr")){
            index = 0;
        }
        else if(ruleKey.equals("color")){
            index = 1;
        }
        else {
            index = 2;
        }

            for (int i = 0; i < items.size(); i++) {
                if(items.get(i).get(index).equals(ruleValue)){
                    count++;
                }
            }
        return count;
    }
}
