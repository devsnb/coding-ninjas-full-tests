package fulltest1;

import java.util.Stack;

public class BackspaceProblem {
    public static String backspace(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (char c : stack) {
            resultBuilder.append(c);
        }

        return resultBuilder.toString();
    }

    public static String removeBackspaces(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (char c : stack) {
            resultBuilder.append(c);
        }
        return resultBuilder.toString();
    }

    public static void main(String[] args) {
        String input = "xy#z";
        System.out.println(removeBackspaces(input));
//        System.out.println((int) '#');
    }
}
