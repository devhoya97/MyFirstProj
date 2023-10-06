package stack;

public class ArrayStack<E> implements StackInterface<E> {
	//field : stack[], topIndex, DEFAULT_CAPACITY, ERROR
	//method : two constructors, push, pop, top, isEmpty, isFull, popAll
	private E stack[];
	private int topIndex;
	private static final int DEFAULT_CAPACITY = 64;
	private final E ERROR = null;
	
	public ArrayStack() {
		stack = (E[]) new Object[DEFAULT_CAPACITY];
		topIndex = -1;
	}
	public ArrayStack(int n) {
		stack = (E[]) new Object[n];
		topIndex = -1;
	}
	public void printAll() {
		for(int subIndex = topIndex; subIndex > -1 ; subIndex--) {
			System.out.println(stack[subIndex]);
		}
	}
	public void push(E newItem) {
		if (isFull()) {
			E newStack[] = (E[]) new Object[(topIndex + 1) * 2];
			int newTopIndex = topIndex + 1;
			while(topIndex != -1) {
				newStack[topIndex] = pop();
			}
			newStack[newTopIndex] = newItem;
			stack = newStack;
			topIndex = newTopIndex;
		}else {
			topIndex++;
			stack[topIndex] = newItem;
		}
	}
	public E pop() {
		if (isEmpty()) {
			return ERROR;
		}else {
			E tmp = stack[topIndex];
			topIndex--;
			return tmp;
		}
	}
	public E top() {
		if (isEmpty())
			return ERROR;
		else
			return stack[topIndex];
	}
	public boolean isEmpty() {
		if (topIndex == -1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (topIndex == stack.length-1) {
			return true;
		}
		else
			return false;
	}
	public void popAll() {
		stack = (E[]) new Object[stack.length];
		topIndex = -1;
	}
}