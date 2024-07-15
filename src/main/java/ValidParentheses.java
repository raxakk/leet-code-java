import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character, Integer> parenthesesCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (parenthesesCount.containsKey(s.charAt(i))) {
                Integer count = parenthesesCount.get(s.charAt(i));
                parenthesesCount.put(s.charAt(i), ++count);
            } else {
                parenthesesCount.put(s.charAt(i), 1);
            }
        }
        return Objects.equals(parenthesesCount.get('('), parenthesesCount.get(')'))
                && Objects.equals(parenthesesCount.get('{'), parenthesesCount.get('}'))
                && Objects.equals(parenthesesCount.get('['), parenthesesCount.get(']'));
    }

    public static boolean isValid1(String s) {
        Stack<Character> open = new Stack<>();
        Stack<Character> closed = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                open.push(c);
            } else {
                switch (c) {
                    case ')' -> closed.push('(');
                    case '}' -> closed.push('{');
                    case ']' -> closed.push('[');
                }

            }
        }
        while (!open.isEmpty()) {
            if (open.pop() != closed.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid2(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                characters.push(c);
            } else {
                switch (c) {
                    case ')' -> characters.push('(');
                    case '}' -> characters.push('{');
                    case ']' -> characters.push('[');
                }

            }
        }
        while (!characters.isEmpty()) {
            if (characters.pop() != characters.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid3(String s) {
        char start = s.charAt(0);
        if (start == '(' || start == '{' || start == '[') {
            for (int i = 1; i < s.length(); i++) {
                char end = s.charAt(i);
                if (isMatching(start, end)) {
                    if (s.length() - 1 - i > 0) {
                        return isValid3(s.substring(i + 1));
                    } else if (i > 1) {
                        return isValid3(s.substring(1, i));
                    }
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public static boolean isMatching(char start, char end) {
        if (end == ')') {
            return start == '(';
        } else if (end == '}') {
            return start == '{';
        } else if (end == ']') {
            return start == '[';
        }
        return false;
    }
}
