package list;

public class CircularLinkedList<E> implements ListInterface<E> {
	private Node<E> tail;
	private int numItems;
	
	public CircularLinkedList() {
		numItems = 0;
		tail = new Node<>(null, tail);
	}
	
	public void add(int index, E item) {
		if (index >= 0 && index <= numItems) {
			Node<E> prevNode = getNode(index - 1);
			Node<E> newNode = new Node<>(item, prevNode.next);
			prevNode.next = newNode;
			if (index == numItems)
				tail = newNode;
			numItems++;
		}
	}
	
	public void append(E item) {
		Node<E> prevNode = tail;
		Node<E> newNode = new Node<>(item, tail.next);
		prevNode.next = newNode;
		tail = newNode;
		numItems++;
	}
	
	public E remove(int index) {
		if (index >= 0 && index < numItems) {
			Node<E> prevNode = getNode(index - 1);
			E rItem = prevNode.next.item;
			prevNode.next = prevNode.next.next;
			if (index == numItems-1) // 여기가 이해 안감. index == numItems-1 아닌가?
				tail = prevNode;
			numItems--;
			return rItem;
		} else return null;
	}
	
	public boolean removeItem(E x) { // 책이랑 좀 다름. 
		Node<E> prevNode, currNode = tail.next;
		for (int i = 0; i < numItems; i++) {
			prevNode = currNode;
			currNode = currNode.next;
			if (((Comparable)(currNode.item)).compareTo(x) == 0) {
				prevNode.next = currNode.next;
				numItems--;
				return true;
			}
		}
		return false;
	}
	
	public E get(int index) {
		if (index >=0 && index < numItems) {
			return getNode(index).item;
		}else {
			return null;
		}
	}
	
	public Node<E> getNode(int index){
		if (index >= -1 && index <= numItems) { //여기도 이해 안감. index <= numItems-1 아닌가?
			Node<E> currNode = tail.next;
			for (int i = 0; i <= index; i++) {
				currNode = currNode.next;
			}
			return currNode;
		}
		else
			return null;
	}
	
	public void set(int index, E x) {
		if (index >=0 && index < numItems) {
			getNode(index).item = x;
		} else {
			/* 에러 처리 */
		}
	}
	
	public final int NOT_FOUND = -12345;
	public int indexOf(E x) {
		Node<E> currNode = tail.next;
		for(int i = 0; i < numItems; i++) {
			currNode = currNode.next;
			if (((Comparable)(currNode.item)).compareTo(x) == 0) {
				return i;
			}
		}
		return NOT_FOUND;
	}
	
	public int len() {
		return numItems;
	}
	
	public boolean isEmpty() {
		return numItems == 0;
	}
	
	public void clear() {
		numItems = 0;
		tail = new Node<>(null, tail);
	}
}
