package queue;

public class DoublyLinkedQueue implements QueueInterface{
	private DNode head;
	private static final Object ERROR = null;
	public DoublyLinkedQueue() {
		head = new DNode(null);
		head.prev = head;
		head.next = head;
	}
	public boolean isEmpty() {
		return (head.next == head);
	}
	public void enqueue(Object newItem) {
		DNode newNode = new DNode(newItem, head.prev, head);
		head.prev.next = newNode;
		head.prev = newNode;
	}
	public Object dequeue() {
		if (isEmpty())
			return ERROR;
		else {
			Object frontItem = head.next.item;
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head = head.next;
			return frontItem;
		}
	}
	public Object front() {
		if (isEmpty())
			return ERROR;
		else {
			return head.next.item;
		}
	}
	public void dequeueAll() {
		head.prev = head;
		head.next = head;
	}
}
