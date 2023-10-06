package BookStudy;

public class Ch1 {
	public static int solution(int[] arr1, int[] arr2) {
		if (arr1[0] < 1 || arr1[1] > 400 || arr2[0] < 1 || arr2[1] > 400 || arr1[1]-arr1[0] !=1 || arr2[1]-arr2[0] !=1)
			return -1;
		int addMax1 = 0, mulMax1 =0, addMax2 =0, mulMax2 =0;
		int max1 = 0, max2 = 0;
		addMax1 = add(arr1[0]) >= add(arr1[1]) ? add(arr1[0]) : add(arr1[1]);
		addMax2 = add(arr2[0]) >= add(arr2[1]) ? add(arr2[0]) : add(arr2[1]);
		mulMax1 = mul(arr1[0]) >= mul(arr1[1]) ? mul(arr1[0]) : mul(arr1[1]);
		mulMax2 = mul(arr2[0]) >= mul(arr2[1]) ? mul(arr2[0]) : mul(arr2[1]);
		
		max1 = addMax1 >= mulMax1? addMax1 : mulMax1;
		max2 = addMax2 >= mulMax2? addMax2 : mulMax2;
		
		return max1 == max2 ? 0 : max1 > max2 ? 1 : 2;
	}
	public static int add(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	public static int mul(int num) {
		int sumMul = 1;
		while (num !=0) {
			sumMul *= num%10;
			num /= 10;
		}
		return sumMul;
	}
	public static void main(String args[]) {
		System.out.println(solution(new int[]{97,98}, new int[]{197,198}));
		System.out.println(solution(new int[]{131,132}, new int[]{211,212}));
		System.out.println(solution(new int[]{99,102}, new int[]{211,212}));
	}
}
