package 有效的括号;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
/**
 *2019/4/14
 * author:lixinyi
 * leetcode 有效的括号
 */
public class BracketMatching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.isValid(s));
    }
}

class Solution4 {
//    private HashMap<Character,Character> map;
//////
//////    public Solution4(){
//////        this.map = new HashMap<Character, Character>();
//////        this.map.put(')','(');
//////        this.map.put(']','[');
//////        this.map.put('}','{');
//////    }
//////    public boolean isValid(String s) {
//////        Stack<Character> stack = new Stack<>();
//////        int length = s.length();
//////        if(length%2 != 0)
//////            return false;
//////        String before = s.substring(0,length/2);
//////        String rear = s.substring(length/2,length);
//////        for(int i = 0;i<before.length();i++){
//////            stack.push(before.charAt(i));
//////        }
//////        for(int i = 0;i<rear.length();i++){
//////            char c = rear.charAt(i);
//////            if(map.containsKey(c)){
//////                char topElement = stack.empty() ? '#' : stack.pop();
//////                if(topElement != this.map.get(c))
//////                    return false;
//////            }
//////        }
//////        return true;
//////    }

    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    public Solution4() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

