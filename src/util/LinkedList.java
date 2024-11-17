package util;

public class LinkedList<T> implements LinkedListADT<T>{
	private LinearNode<T> head;
	private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(T element) {
        if (!contains(element)) {
            LinearNode<T> newNode = new LinearNode<>(element);
            if (head == null) {
                head = newNode;
            } else {
                LinearNode<T> current = head;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(newNode);
            }
            size++;
        }
    }

    public void add(T element, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (!contains(element)) {
            LinearNode<T> newNode = new LinearNode<>(element);
            if (position == 1) {
                newNode.setNext(head);
                head = newNode;
            } else {
                LinearNode<T> current = head;
                for (int i = 1; i < position - 1; i++) {
                    current = current.getNext();
                }
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            }
            size++;
        }
    }

    public void delete(T element) {
        if (isEmpty()) return;
        
        if (head.getElement().equals(element)) {
            head = head.getNext();
            size--;
            return;
        }
        
        LinearNode<T> current = head;
        while (current.getNext() != null && !current.getNext().getElement().equals(element)) {
            current = current.getNext();
        }
        
        if (current.getNext() != null) {
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    public void display() {
        LinearNode<T> current = head;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    public LinearNode<T> getFirstNode() { return head; }

    public LinearNode<T> getLastNode() {
        LinearNode<T> current = head;
        while (current != null && current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    public T getFirstElement() {
        return head != null ? head.getElement() : null;
    }

    public T getLastElement() {
        return getLastNode() != null ? getLastNode().getElement() : null;
    }

    public T getNextElement(T currentElement) {
        LinearNode<T> current = head;
        while (current != null && !current.getElement().equals(currentElement)) {
            current = current.getNext();
        }
        return current != null && current.getNext() != null ? current.getNext().getElement() : null;
    }

    public boolean isEmpty() { return size == 0; }

    public boolean contains(T element) {
        LinearNode<T> current = head;
        while (current != null) {
            if (current.getElement().equals(element)) return true;
            current = current.getNext();
        }
        return false;
    }
}

	


