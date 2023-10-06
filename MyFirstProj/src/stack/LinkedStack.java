package stack;
import list.Node;

public class LinkedStack<E> implements StackInterface<E> {
	private Node<E> topNode;
	private final E ERROR = null;
	public LinkedStack() {
		topNode = null;
	}
	public void copyAll(LinkedStack<E> b){
		Node<E> subNode = topNode;
		LinkedStack<E> c = new LinkedStack<>();
		while(subNode != null) {
			c.push(subNode.item);
			subNode = subNode.next;
		}
		while(!c.isEmpty()) {
			b.push(c.pop());
		}
	}
	//push, pop, top, isEmpty, popAll
	public void printAll() {
		Node<E> subNode = topNode;
		while(subNode != null) {
			System.out.println(subNode.item);
			subNode = subNode.next;
		}
	}
	public void push(E newItem) {
		topNode = new Node<>(newItem, topNode);
	}
	public E pop() {
		if (isEmpty())
			return ERROR;
		else {
			E temp = topNode.item;
			topNode = topNode.next;
			return temp;
		}
	}
	public E top() {
		if (isEmpty())
			return ERROR;
		else {
			return topNode.item;
		}
	}
	public boolean isEmpty() {
		return (topNode == null);
	}
	public void popAll() {
		topNode = null;
	}
}
