package queue;

public class ArrayQueue<E> implements QueueInterface<E> {
	private E queue[];
	private int front, tail, numItems;
	private static final int DEFAULT_CAPACITY = 64;
	private final E ERROR = null;
	
	public ArrayQueue() {
		queue = (E[]) new Object[DEFAULT_CAPACITY];
		front = 0;
		tail = DEFAULT_CAPACITY - 1;
		numItems = 0;
	}
	public ArrayQueue(int n) {
		queue = (E[]) new Object[n];
		front = 0;
		tail = n - 1;
		numItems = 0;
	}
	public void printAll() {
		if (isEmpty()) {
			System.out.println("empty");
		}
		else {
			int printIndex = front;
			for (int i = 0; i < numItems; i++) {
				System.out.println(queue[printIndex]);
				printIndex = (printIndex + 1) % queue.length;
			}
		}
			
	}
	public void enqueue(E x) {
		if (isFull()) {
			E biggerQ[] = (E[]) new Object[queue.length * 2];
			int copyIndex = front;
			for (int i = 0; i < queue.length; i++) {
				biggerQ[i] = queue[copyIndex];
				copyIndex = (copyIndex + 1) % queue.length;
			}
			queue = biggerQ;
			front = 0;
			tail = numItems;
			queue[tail] = x;
			numItems++;
		}
		else {
			tail = (tail + 1) % queue.length;
			queue[tail] = x;
			numItems++;
		}
	}
	public boolean isFull() {
		return (numItems == queue.length);
	}
	public E dequeue() {
		if (isEmpty()) {
			return ERROR;
		}
		else {
			E frontItem = queue[front];
			front = (front + 1) % queue.length;
			numItems--;
			return frontItem;
		}
	}
	public E front() {
		if (isEmpty()) {
			return ERROR;
		}
		else {
			return queue[front];
		}
	}
	public boolean isEmpty() {
		if (numItems == 0)
			return true;
		else
			return false;
	}
	public void dequeueAll() {
		queue = (E[]) new Object[queue.length];
		front = 0;
		tail = queue.length - 1;
		numItems = 0;
	}
}
