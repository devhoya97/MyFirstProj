package BookStudy;
import java.util.Arrays;
import java.util.regex.Pattern;

public class problem6 {
	
	public static String[] solution(String[][] arr2D) {
		if(!validation(arr2D))
			return null;
		boolean[] duplication = new boolean[arr2D.length];
		int count = 0;
		for(int i=0; i<arr2D.length-1; i++) {
			char[] ref = new char[2];
			for(int j=0; j<arr2D[i][1].length()-1; j++) {
				ref[0] = arr2D[i][1].charAt(j);
				ref[1] = arr2D[i][1].charAt(j+1);
				for(int k = i+1; k < arr2D.length; k++) {
					for (int m = 0; m < arr2D[k][1].length()-1; m++) {
						char[] obj = new char[2];
						obj[0] = arr2D[k][1].charAt(m);
						obj[1] = arr2D[k][1].charAt(m+1);
						if(Arrays.toString(ref).equals(Arrays.toString(obj))) {
							duplication[i] = true;
							duplication[k] = true;
						}
					}
				}
			}
		}
		for (int i=0; i<duplication.length; i++) {
			if(duplication[i])
				count++;
		}
		String[] result = new String[count];
		count = 0;
		for (int i=0; i<duplication.length; i++) {
			if(duplication[i]) {
				result[count] = arr2D[i][0];
				count++;
			}
		}
		return result;
	}
	public static boolean validation(String[][] arr2D) {
		if(!(1<=arr2D.length && arr2D.length<=10000))
			return false;
		for(int i=0; i<arr2D.length; i++) {
			char[] email = new char[10];
			int golbangLocation = 0;
			
			if(!(11<=arr2D[i][0].length() && arr2D[i][0].length() <20))
				return false;
			for(int j=0; j<arr2D[i][0].length();j++) {
				if(arr2D[i][0].charAt(j) == '@') {
					golbangLocation = j;
					System.out.println(golbangLocation);
				}
			}
			if(golbangLocation == 0)
				return false;
			for(int j = 0; j<10; j++) {
				email[j] = arr2D[i][0].charAt(golbangLocation+j);
			}
			//System.out.println(!(String.copyValueOf(email).equals("@email.com")));
			if (!(String.copyValueOf(email).equals("@email.com")))
				return false;
		
			for(int j=0; j<arr2D[i][1].length(); j++) {
				if(!('가'<=arr2D[i][1].charAt(j) && arr2D[i][1].charAt(j)<='힣'))
					return false;
			}	
		}
		return true;
	}
	public static void main(String args[]) {
		String[][] arr2D = {
				{"jm@email.com", "제이엠"},
				{"jasom@email.com", "제이슨"},
				{"woniee@email.com", "워니"},
				{"mj@email.com", "엠제이"},
				{"nowm@email.com","이제엠"}
		};
		System.out.println(Arrays.toString(solution(arr2D)));
	}
}
