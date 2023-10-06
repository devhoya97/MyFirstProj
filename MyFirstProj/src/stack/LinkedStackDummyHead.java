package stack;
import list.Node;

public class LinkedStackDummyHead<E> implements StackInterface<E> {
	private Node<E> topNode;
	private final E ERROR = null;
	public LinkedStackDummyHead() {
		topNode = new Node<>(null, null);
	}
	//push, pop, top, isEmpty, popAll
	public void push(E newItem) {
		topNode.next = new Node<>(newItem, topNode.next);
	}
	public E pop() {
		if (isEmpty())
			return ERROR;
		else {
			E temp = topNode.next.item;
			topNode.next = topNode.next.next;
			return temp;
		}
	}
	public E top() {
		if (isEmpty())
			return ERROR;
		else {
			return topNode.next.item;
		}
	}
	public boolean isEmpty() {
		return (topNode.next == null);
	}
	public void popAll() {
		topNode.next = null;
	}
}
