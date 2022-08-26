import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.size() == 0) return false;
                if (c == ')' && stack.pop() != '(') return false;
                if (c == ']' && stack.pop() != '[') return false;
                if (c == '}' && stack.pop() != '{') return false;
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([]{})"));
        System.out.println(isValid("([{}])"));
    }
}
