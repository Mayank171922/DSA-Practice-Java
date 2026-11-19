package collectionframework;

import java.util.Stack;

public class SStack {
    static void main() {

        Stack<Integer> st = new Stack<>();
        int i = 1;
        while(i<=10) {
            st.push(i);
            i++;
        }
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
