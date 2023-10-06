package queue;

public class test {
	public static void main(String args[]) {
		ArrayQueue<Integer> q = new ArrayQueue<>(5);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		q.dequeue();
		q.enqueue(5);
		q.enqueue(6);
		q.printAll();
		}
}
