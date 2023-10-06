package BookStudy;
import java.util.Arrays;

public class problem5 {

	public static int[] solution(int money) {
		if(!validation(money))
			return null;
		int[] moneyNum = new int[9];
		int[] moneyType = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		
		for(int i=0; i<moneyType.length; i++) {
			while(money >= moneyType[i]) {
				money -= moneyType[i];
				moneyNum[i]++;
			}
		}
		return moneyNum;
	}
	public static boolean validation(int money) {
		return money < 1 ? false : money > 1000000 ? false : true;
	}
	public static void main(String args[]) {
		int money = 15000;
		System.out.println(Arrays.toString(solution(money)));
	}
}
