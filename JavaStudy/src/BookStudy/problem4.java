package BookStudy;

public class problem4 {
	public static String solution(String str) {
		String result ="";
		if (!validation(str))
			return "";
		for (int i=0; i<str.length(); i++) {
			result += translate(str.charAt(i));
		}
		return result;
	}
	public static boolean validation(String str) {
		return str.length() < 1 ? false : str.length() > 1000? false : true;
	}
	public static char translate(char ch) {
		char result = ' ';
		if('a'<=ch && ch<='z') {
			result = (char)('z'-(ch-'a'));
		}
		else if ('A'<=ch && ch<='Z'){
			result = (char)('Z'-(ch-'A'));
		}
		else {
			result = ch;
		}
		return result;
	}
	public static void main(String args[]) {
		String word = "I love you";
		System.out.println(solution(word));
	}
}
