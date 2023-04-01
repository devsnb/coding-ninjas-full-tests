package fulltest3;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();

        System.out.println(evaluateExpression(input));
    }

    public static int evaluateExpression(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int sign = 1;
        int result = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (int) (c - '0');
            } else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += sign * num;
                num = 0;
                result *= stack.pop();
                result += stack.pop();
            }
        }

        if (num != 0) {
            result += sign * num;
        }

        return result;
    }
}
