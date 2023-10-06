package stack;
import list.LinkedList;
import list.ListInterface;

public class ListStack2<E> implements StackInterface<E> {
	private ListInterface<E> list2;
	
	public ListStack2() {
		list2 = new LinkedList<E>();
	}
	
	public void push(E newItem) {
		list2.add(list2.len(), newItem);
	}
	public E pop() {
		return list2.remove(list2.len()-1);
	}
	public E top() {
		return list2.get(list2.len()-1);
	}
	public boolean isEmpty() {
		return list2.isEmpty();
	}
	public void popAll() {
		list2.clear();
	}

}
