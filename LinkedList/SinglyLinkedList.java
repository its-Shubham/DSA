package LinkedList;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int deleteFirst() {

        if (head == null) {
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast() {

        if (size == 0) {
            System.out.println("Linked list id Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int deleteAtIndex(int index) {
        int value;
        int i = 0;

        if (size == 0) {
            System.out.println("Linked list id Empty");
            return -1;
        } else if (size - 1 == index) {
            value = deleteLast();
            return value;
        } else if (index == 1 && size == 1) {
            value = deleteFirst();
            return value;
        }
        Node current = head;
        while (i < index - 2) {
            current = current.next;
            i++;
        }
        value = current.next.data;
        current.next = current.next.next;
        size--;
        return value;

    }

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        if (size == 0) {
            System.out.println("Linked List is Empty");
            return -1;
        }

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;

    }

    public int getSize(){
        return size;
    }

}