package stack;

public interface StackInterface<E> {
	//push, pop, top, isEmpty, popAll
	public void push(E newItem);
	public E pop();
	public E top();
	public boolean isEmpty();
	public void popAll();
}
