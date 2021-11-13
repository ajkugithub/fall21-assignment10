public class StackArray<T> {

	private final int size = 100; // Size of the stack array
	private T[] elements; // Array that gets created as a stack
	private int topIndex = -1; // index of the top element

	public StackArray() {
		elements = (T[]) new Object[size];
	}

	public StackArray(int maxSize) {
		elements = (T[]) new Object[maxSize];
	}

	public void push(T element) {
		if (isFull())
			System.out.println("Stack is full and element cannot be pushed");
		// throw new Exception("Stack Full");
		else {
			topIndex++;
			elements[topIndex] = element;
		}
	}

	public void pop() {
		if (isEmpty())
			System.out.println("Stack is empty and element cannot be popped");
		// throw new Exception("Stack Empty");
		else {
			topIndex--;
		}
	}

	public T top() {
		if (isEmpty()) {
			System.out.println("Stack is empty and no Top exists");
			System.exit(1);
			return null;
		} else
			return elements[topIndex];

	}

	public boolean isEmpty() {
		return topIndex == -1;
	}

	public boolean isFull() {
		return (topIndex == elements.length - 1);

	}

	public void printStack() {
		if (isEmpty())
			System.out.println("Stack is empty");
		else
			for (int i = 0; i <= topIndex; i++)
				System.out.print(elements[i] + " ");
		System.out.println();

	}

}
