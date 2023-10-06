package list;

public class CircularDoublyLinkedList<E> implements ListInterface<E> {
	private BidirectionalNode<E> head;
	private int numItems;
	
	public CircularDoublyLinkedList() {
		numItems = 0;
		head = new BidirectionalNode<>(null);
		head.prev = head.next = head;
	}
	
	public void add(int index, E x) {
		if (index>=0 && index <= numItems) {
			BidirectionalNode<E> prevNode = getNode(index-1);
			BidirectionalNode<E> newNode = new BidirectionalNode<>(prevNode, x, prevNode.next);
			prevNode.next.prev = newNode;
			prevNode.next = newNode;
			numItems++;
		}else {
			//error
		}
	}
	public void append(E x) {
		BidirectionalNode<E> newNode = new BidirectionalNode<>(head.prev, x, head);
		head.prev.next = newNode;
		head.prev = newNode;
		numItems++;
	}
	public E remove(int index) {
		if (index>=0 && index<=numItems-1) {
			BidirectionalNode<E> currNode = getNode(index);
			currNode.next.prev = currNode.prev;
			currNode.prev.next = currNode.next;
			numItems--;
			return currNode.item;
		}else {
			return null;
		}
		//여기부터 다시 
	}
	public boolean removeItem(E x) {
		BidirectionalNode<E> currNode = head;
		for (int i = 0; i <= numItems - 1; i++) {
			currNode = currNode.next;
			if (((Comparable)(currNode.item)).compareTo(x) == 0) {
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;
				numItems--;
				return true;
			}
		}
		return false;
	}
	public E get(int index) {
		if (index >= 0 && index <= numItems - 1) {
			return getNode(index).item;
		}else
			return null;
	}
	public void set(int index, E x) {
		if(index >=0 && index <= numItems-1) {
			getNode(index).item = x;
		}else {
			//error code
		}
	}
	public BidirectionalNode<E> getNode(int index){
		if(index>=-1 && index<=numItems-1) {
			BidirectionalNode<E> currNode = head;
			if (index <= numItems/2) {
				for (int i=0; i<=index; i++) 
					currNode = currNode.next;
				
			} else {
				for (int i = numItems-1; i>=index; i--) 
					currNode = currNode.prev;
				
			}
			return currNode;
		}else {
			return null;
		}
	}
	
	public final int NOT_FOUND = -12345;
	public int indexOf(E x) {
		BidirectionalNode<E> currNode = head;
		for (int i = 0; i <= numItems - 1; i++) {
			currNode = currNode.next;
			if (((Comparable)(currNode.item)).compareTo(x) == 0)
				return i;
		}
		return NOT_FOUND;
	}
	
	public int len() {
		return numItems;
	}
	public boolean isEmpty() {
		if (numItems == 0)
			return true;
		else
			return false;
	}
	public void clear() {
		head.prev = head.next = head;
		numItems = 0;
	}
}

//append, remove, removeItem, get, set, getNode, indexOf, len, isEmpty, clear

