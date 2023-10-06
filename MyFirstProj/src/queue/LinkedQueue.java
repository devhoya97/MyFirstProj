package queue;
import list.Node;

public class LinkedQueue<E> implements QueueInterface<E> {
	private Node<E> tail;
	private final E ERROR = null;
	
	public LinkedQueue() {
		tail = null;
	}
	public void copyAll(LinkedQueue<E> b) {
		if (isEmpty()) {
			System.out.println("empty");
		}
		else {
			Node<E> currNode = tail.next;
			while (currNode != tail) {
				b.enqueue(currNode.item);
				currNode = currNode.next;
			}
			b.enqueue(tail.item);
		}
	}
	public void printAll() {
		if (isEmpty())
			System.out.println("empty");
		else {
			Node<E> currNode = tail.next;
			while (currNode != tail) {
				System.out.println(currNode.item);
				currNode = currNode.next;
			}
			System.out.println(tail.item);
		}
	}
	public void enqueue(E x) {
		Node<E> newNode = new Node<>(x);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = tail;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
	}
	public E dequeue() {
		if (isEmpty()) {
			return ERROR;
		}
		else {
			E frontItem = tail.next.item;
			if(tail.next == tail) {
				tail = null;
			}
			else {
				tail.next = tail.next.next;
			}
			return frontItem;
		}
	}
	public E front() {
		if (isEmpty()) {
			return ERROR;
		}
		else
			return tail.next.item;
	}
	public boolean isEmpty() {
		return (tail == null);
	}
	public void dequeueAll() {
		tail = null;
	}
}
