package BookStudy;

public class problem3 {
	public static int solution(int number) {
		int result = 0;
		for(int i =1; i<=number; i++) {
			int testNum = i;
			while (testNum != 0) {
				if((testNum % 10) % 3 == 0 && testNum%10 != 0)
					result++;
				testNum /= 10;
			}
		}
		return result;
	}
	public static void main(String args[]) {
		int number = 33;
		System.out.println(solution(number));
	}
}
