package list;

public class test {
	//private int testNum = 0;
	//public test() {
	//	testNum = 1;
	//}
	public static void main(String[] args) {
		IntegerArrayList list1 = new IntegerArrayList();
		Integer testInt = new Integer(200);
		Integer testIdx = new Integer(0);
		list1.append(testInt);
		System.out.println(list1.get(0));
		System.out.println(list1.get(testIdx));
		/*
		test testObj = new test();
		int testint = 100;
		Object testVal = testint;
		Integer testInteger = new Integer(30);
		System.out.println(testInteger);
		//System.out.println(testObj.testNum);
		int[] testArray = new int[3];
		testArray[0] = 3;
		testArray[1] = 2;
		testArray[2] = 1;
		System.out.println(testArray[0]);
		java.util.Arrays.sort(testArray,0,3);
		System.out.println(testArray[0]);
		System.out.println(testVal);
		*/
		/*
		IntegerArrayList list = new IntegerArrayList();
		list.add(0, 300);
		list.add(0, 200);
		list.add(0, 100);
		list.printAll();
		//System.out.println(list);
		list.append(500);
		list.append(600);
		list.remove(3);
		list.printAll();
		//System.out.println(list);
		list.add(3, 250);
		list.add(1, 50);
		list.add(0, 10);
		list.append(700);
		list.remove(1);
		list.removeItem(600);
		list.printAll();
		//System.out.println(list);
		 * 
		 */
	}
}
