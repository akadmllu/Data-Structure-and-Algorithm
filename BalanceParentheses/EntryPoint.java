import java.util.Stack;;

public class EntryPoint {
	public static char[][] TOKEN = {{'[',']'},{'(',')'},{'{','}'}};

	private static boolean isOpenTerm(char c) {
		for(char[] array : TOKEN) {
			if(array[0] == c)
				return true;
		}
		return false;
	}
	private static boolean matches(Character cOpenTerm, char cCloseTerm) {
		for(char[] array : TOKEN) {
			if(array[0] == cOpenTerm && array[1] == cCloseTerm)
				return true;
		}
		return false;
	}
	public static boolean isBalance(String sExpression) {
		Stack<Character> stack = new Stack<Character>();
		for(char c : sExpression.toCharArray()) {
			if(isOpenTerm(c)) {
				stack.push(c);
			}else {
				if(stack.isEmpty() || !matches(stack.pop(),c)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		String sText = "{([]{}){[]}}";
		System.out.println(isBalance(sText));
	}
}
