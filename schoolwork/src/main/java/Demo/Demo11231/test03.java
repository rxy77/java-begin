package Demo.Demo11231;

import java.util.Scanner;
import java.util.Stack;

public class test03 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '(') || (s.charAt(i) == '[') || (s.charAt(i) == '{')) {
                stack.push(s.charAt(i));
            }
            if ((s.charAt(i) == ')') || (s.charAt(i) == ']') || (s.charAt(i) == '}')) {
                if (stack.empty()) {
                    return false;
                }
                if ((stack.peek() == '(' && s.charAt(i) == ')') || (stack.peek() == '[' && s.charAt(i) == ']') || (stack.peek() == '{' && s.charAt(i) == '}') ) {     // 如果栈顶元素和下一个右括号相匹配，则将其栈顶元素出栈
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(isValid(string));
    }

}
