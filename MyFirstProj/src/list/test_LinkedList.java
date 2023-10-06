package list;

public class test_LinkedList {
	public static void concat(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		Node<Integer> list1LastNode = list1.getNode(list1.len()-1);
		list1LastNode.next = list2.head.next;
		list1.numItems += list2.numItems;
	}
	
	public static void checkSamelist(Node<Integer> node1, Node<Integer> node2) {
		Node<Integer> checkNode1 = node1;
		Node<Integer> checkNode2 = node2;
		while (checkNode1.next != null) {
			checkNode1 = checkNode1.next;
		}
		while (checkNode2.next != null) {
			checkNode2 = checkNode2.next;
		}
		if(checkNode1 == checkNode2)
			System.out.println("They are in the same list");
		else
			System.out.println("They are in the different list");
	}
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.append(1);
		list1.append(2);
		list2.append(3);
		list2.append(4);
		//concat(list1, list2);
		//list1.printInterval(0,list1.len()-1);
		Node<Integer> node1 = list1.getNode(0);
		Node<Integer> node2 = list2.getNode(0);
		checkSamelist(node1, node2);
		concat(list1, list2);
		checkSamelist(node1, node2);
	}
}
