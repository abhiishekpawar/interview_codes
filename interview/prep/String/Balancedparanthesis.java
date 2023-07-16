package interview.prep.String;



//1.If any opening are found then push that into the stack
//2.If any closing are found then check if top is of same kind or not, if same then pop.
//At the end if stack is empty then result will be true else flase

import java.util.*;

public class Balancedparanthesis {
	public static void main(String[] args) {
		
		String s = "{([])}";
		Stack<Character> stack= new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == '{' || ch =='[' || ch == '(') {
				stack.push(ch);
			}else if(ch=='}' && stack.peek() == '{') {
				stack.pop();
			}
			else if(ch==']' && stack.peek() == '[') {
				stack.pop();
			}
			else if(ch==')' && stack.peek() == '(') {
				stack.pop();
			}
		}
		if(stack.empty())
			System.out.println("Balanced");
		else
			System.out.println("not balanaced");
	}

}










