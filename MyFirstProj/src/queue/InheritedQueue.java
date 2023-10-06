package queue;
import list.LinkedList;

public class InheritedQueue<E> extends LinkedList<E> implements QueueInterface<E>{
	public InheritedQueue() {
		super();
	}
	public void printAll() {
		for(int i = 0; i < len(); i++) {
			System.out.println(get(i));
		}
	}
	public void enqueue(E x) {
		append(x);
	}
	public E dequeue() {
		return remove(0);
	}
	public E front() {
		return get(0);
	}
	public void dequeueAll() {
		clear();
	}
}
