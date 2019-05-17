class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int index = -1;

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack[++index] = c;
            } else if (c == ')' && index > -1 && stack[index] == '(') {
                --index;
            } else if (c == ']' && index > -1 && stack[index] == '[') {
                --index;
            } else if (c == '}' && index > -1 && stack[index] == '{') {
                --index;
            } else {
                ++index;
            }
        }

        return index > -1 ? false : true;
    }
} // 0ms

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }
} // 2ms