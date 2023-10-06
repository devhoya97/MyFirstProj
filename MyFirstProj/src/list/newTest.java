package list;

interface newTestInterface<E> {
	public E add(E para2);
}

class newTestClass implements newTestInterface<Integer> {
	private Integer value;
	public newTestClass(Integer v) {
		value = v;
	}
	public Integer add(Integer v) {
		return value+v;
	}
}

public class newTest {
	public static void main(String[] args) {
		System.out.println("hello world");
		Integer t = 10;
		System.out.println(t.compareTo(11));
		newTestClass testObject = new newTestClass(1);
		System.out.println(testObject.add(2));
	}

}
