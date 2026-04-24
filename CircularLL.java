public class CircularLL {

	private static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node tail;
	private int size;

	public CircularLL() {
		this.tail = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public int size() {
		return size;
	}

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);

		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
		}

		size++;
	}

	public void insertAtEnd(int data) {
		insertAtBeginning(data);
		tail = tail.next;
	}

	public boolean deleteByValue(int value) {
		if (isEmpty()) {
			return false;
		}

		Node current = tail.next;
		Node prev = tail;

		do {
			if (current.data == value) {
				if (current == tail && current == tail.next) {
					tail = null;
				} else {
					prev.next = current.next;
					if (current == tail) {
						tail = prev;
					}
				}

				size--;
				return true;
			}

			prev = current;
			current = current.next;
		} while (current != tail.next);

		return false;
	}

	public boolean contains(int value) {
		if (isEmpty()) {
			return false;
		}

		Node current = tail.next;

		do {
			if (current.data == value) {
				return true;
			}
			current = current.next;
		} while (current != tail.next);

		return false;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return;
		}

		Node current = tail.next;
		do {
			System.out.print(current.data + " ");
			current = current.next;
		} while (current != tail.next);
		System.out.println();
	}

	public static void main(String[] args) {
		Cir 
	}
}
