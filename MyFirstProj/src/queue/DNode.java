package queue;

public class DNode {
	public Object item;
	public DNode prev;
	public DNode next;
	public DNode(Object newItem) {
		item = newItem;
		prev = next = null;
	}
	public DNode(Object newItem, DNode prevNode, DNode nextNode) {
		item = newItem;
		prev = prevNode;
		next = nextNode;
	}
}
