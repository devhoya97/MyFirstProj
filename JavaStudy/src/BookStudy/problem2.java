package BookStudy;

public class problem2 {
	public static boolean validation(String str) {
		if(1<=str.length() && str.length()<=1000) {
			for (int i = 0; i<str.length(); i++) {
				if(!('a'<=str.charAt(i) && str.charAt(i)<='z'))
					return false;
			}
			return true;
		}
		else
			return false;
	}
	
	public static String solution(String str) {
		boolean duplication = false;
		char ch1 =' ', ch2=' ';	
		String result = str;
		String tmp ="";
		do {
			duplication = false;
			tmp = "";
			for(int i=0; i<result.length(); i++) {
				if (i == result.length()-1) {
					tmp += result.charAt(i);
				}
				else {
					ch1 = result.charAt(i);
					ch2 = result.charAt(i+1);
					if(ch1 == ch2) {
						duplication = true;
						i++;
						continue;
					}
					tmp += ch1;	
				}
			}
			result = tmp;
			//System.out.println(result);
		}while(duplication);
		return result;
	}
	public static void main(String args[]) {
		String cryptogram = "zyelleyz";
		if(validation(cryptogram)) {
			System.out.println(solution(cryptogram));
		}
	}
}
