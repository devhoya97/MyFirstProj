//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
class Car {
	int price;
	String carName;
	public Car(int p, String c) {
		price = p;
		carName = c;
	}
}
public class Sample {
    public static void main(String[] args) {
    	int a = 9;
    	int b = 30;
    	String s = Integer.toBinaryString(a|b);
    	System.out.println(s);
    	int[] arr = new int[10];
    	for (int i = 0; i<10; i++) {
    		arr[i] = i;
    	}
    	Car[] myCar = new Car[10];
    	for (int i = 0; i<10; i++) {
    		myCar[i] = new Car(i, "Car"+i);
    	}
    }
}