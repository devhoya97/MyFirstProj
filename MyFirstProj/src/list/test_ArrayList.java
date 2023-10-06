package list;

public class test_ArrayList {
	private static String test_output =""; 
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0, 300);
		list.add(0, 200);
		list.add(0, 100);
		list.append(500);
		list.append(600);
		list.remove(3);
		list.add(3, 250);
		list.add(1, 50);
		list.add(0, 10);
		list.append(700);
		list.remove(1);
		list.removeItem(600);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add(0, "test");
		list2.add(0, "sample");
		list2.add(0, "String");
		test_output = list2.get(0);
		test_output = list2.get(1);
		test_output = list2.get(2);
		list2.append("test2");
		list2.remove(3);
		list2.add(3, "added-at-3");
		list2.add(0, "added-at-1");
		list2.append("appended");
		list2.remove(1);
		list2.removeItem("added-at-3");
		
	}
}
