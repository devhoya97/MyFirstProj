package queue;
import list.CircularLinkedList;
import list.ListInterface;

public class ListQueue<E> implements QueueInterface<E> {
	private ListInterface<E> list;
	public ListQueue() {
		list = new CircularLinkedList<E>();
	}
	public void printAll() {
		for(int i = 0; i < list.len(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void enqueue(E x) {
		list.append(x);
	}
	public E dequeue() {
		return list.remove(0);
	}
	public E front() {
		return list.get(0);
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public void dequeueAll() {
		list.clear();
	}
}
