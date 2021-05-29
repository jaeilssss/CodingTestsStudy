

import java.util.Stack;

public class Solution {

    Stack<Character> stack;
    public int solution(String s) {
        stack = new Stack<>();
       for(int i = 0 ; i <s.length();i++){
           if(stack.size()==0){
               stack.push(s.charAt(i));
           }else{
               if(s.charAt(i)==stack.peek()){
                   stack.pop();
               }else {
                   stack.push(s.charAt(i));
               }
           }
       }
        return (stack.empty()) ? 1:0;
    }
}