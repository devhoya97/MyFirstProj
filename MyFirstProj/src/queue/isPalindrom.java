package queue;
import stack.LinkedStack;

public class isPalindrom {
	private static boolean isPalindrom(String A) {
		LinkedStack s = new LinkedStack();
		LinkedQueue q = new LinkedQueue();
		for (int i = 0; i < A.length(); i++) {
			s.push(A.charAt(i));
			q.enqueue(A.charAt(i));
		}
		while(!s.isEmpty() && s.pop() == q.dequeue()) {
			
		}
		if(s.isEmpty())
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Palindrom Check!");
		String str = "lioninoil";
		boolean t = isPalindrom(str);
		System.out.println(str + " is Palindrom?: "+t);
	}

}
