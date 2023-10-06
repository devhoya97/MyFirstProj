package stack;
import list.LinkedList;

public class InheritedStack<E> extends LinkedList<E> implements StackInterface<E>{
	public InheritedStack() {
		super();
	}
	public void printAll() {
		for(int i = 0; i < len(); i++) {
			System.out.println(get(i));
		}
	}
	
	public void push(E newItem) {
		add(0, newItem);
	}
	public E pop() {
		if (!isEmpty()) {
			return remove(0);
		}
		else
			return null;
	}
	public E top() {
		return get(0);
	}
	public void popAll() {
		clear();
	}
}
