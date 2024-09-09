package LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {

        SinglyLinkedList ll = new SinglyLinkedList();
        ll.print();
        ll.addFirst(10);
        ll.addLast(12);
        ll.addLast(20);
        ll.addFirst(31);
        ll.print();
        System.out.println();
        System.out.println("size is -> " + ll.getSize());
        ll.add(2, 15);
        ll.print();
        System.out.println();
        System.out.println("size is -> " + ll.getSize());
        System.out.println(ll.deleteAtIndex(3));
        System.out.println("Key found at "+ll.itrSearch(10));
        System.out.println("Key found at "+ll.itrSearch(20));
        ll.print();
    }
}