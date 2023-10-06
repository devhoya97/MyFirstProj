package queue;
import list.Node;

public class LinkedQueueDummy<E> implements QueueInterface<E> {
	private Node<E> tail;
	private Node<E> head;
	private final E ERROR = null;
	
	public LinkedQueueDummy() {
		head = new Node<>(null);
		tail = head;
		head.next = head;
	}
	public void enqueue(E x) {
		Node<E> newNode = new Node<>(x, head);
		tail.next = newNode;
		tail = newNode;
	}
	public E dequeue() {
		if (isEmpty()) {
			return ERROR;
		}
		else {
			E frontItem = head.next.item;
			head.next = head.next.next;
			if (head.next == head)
				tail = head;
			return frontItem;
		}
	}
	public E front() {
		if (isEmpty()) {
			return ERROR;
		}
		else
			return head.next.item;
	}
	public boolean isEmpty() {
		return (head == tail);
	}
	public void dequeueAll() {
		tail = head;
		head.next = head;
	}
}
