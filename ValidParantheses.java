import java.util.Stack;
import java.util.Scanner;

public class ValidParantheses {

    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            }
            else if (ch == ')') {
                if (stk.empty() || stk.pop() != '(') return false;
            }
            else if (ch == ']') {
                if (stk.empty() || stk.pop() != '[') return false;
            }
            else if (ch == '}') {
                if (stk.empty() || stk.pop() != '{') return false;
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        if (isValid(s)) {
            System.out.println("Valid ");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
