package queue;
import list.LinkedList;
import list.ListInterface;

public class ListQueue_Problem<E> implements QueueInterface<E> {
	private ListInterface<E> list;
	public ListQueue_Problem() {
		list = new LinkedList<E>();
	}
	
	public void enqueue(E x) {
		list.add(0, x);
	}
	public E dequeue() {
		return list.remove(list.len()-1);
	}
	public E front() {
		return list.get(list.len()-1);
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public void dequeueAll() {
		list.clear();
	}
}
