package list;
import stack.LinkedStack;

public class LinkedList<E> implements ListInterface<E> {
	public Node<E> head;
	public int numItems;
	private final int NOT_FOUND = -12345;
	
	public LinkedList() {
		numItems = 0;
		head = new Node<>(null,null);
	}
	public void printReverse() {
		LinkedStack<E> LS = new LinkedStack<>();
		Node<E> currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
			LS.push(currNode.item);
		}
		while(!LS.isEmpty()) {
			System.out.println(LS.pop());
		}
	}
	
	public void printInterval(int i, int j) {
		Node<E> tNode = getNode(i);
		while(i<=j) {
			System.out.println(tNode.item);
			tNode = tNode.next;
			i++;
		}
	}
	public int lastIndexOf(E x) {
		int index = -1;
		Node<E> currNode = head;
		for (int i = 0; i <= numItems - 1; i++) {
			currNode = currNode.next;
			if (((Comparable)(currNode.item)).compareTo(x) == 0)
				index = i;
		}
		if (index == -1)
			return NOT_FOUND;
		else
			return index;
	}
	
	public void add(int index, E item) {
		if (index >= 0 && index <= numItems) {
			Node<E> prevNode = getNode(index - 1);
			Node<E> newNode = new Node<>(item, prevNode.next);
			prevNode.next = newNode;
			numItems++;
		}
	}
	
	public void append(E item) {
		Node<E> newNode = new Node<>(item, null);
		Node<E> prevNode = head;
		while (prevNode.next != null) {
			prevNode = prevNode.next;
		}
		prevNode.next = newNode;
		numItems++;
	}
	
	public E remove(int index) {
		if (index >= 0 && index < numItems) {
			Node<E> prevNode = getNode(index - 1);
			Node<E> currNode = prevNode.next;
			prevNode.next = currNode.next; // 그냥 currNode없이 prevNode.next = prevNode.next.next해도 될듯?
			numItems--;
			return currNode.item;
		}else {
			return null;
		}
	}
	
	public boolean removeItem(E x) { // 책이랑 좀 다름. 
		Node<E> prevNode, currNode = head;
		while(currNode.next != null) {
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
		if (index >= -1 && index < numItems) {
			Node<E> currNode = head;
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
	
	public int indexOf(E x) {
		Node<E> currNode = head;
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
		head = new Node<>(null,null);
	}
}
