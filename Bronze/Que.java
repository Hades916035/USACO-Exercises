import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public MyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Que {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();

        System.out.print("1. Add" +
                  "\n" + "2. Remove" +
                  "\n" + "3. Print" +
                  "\n" + "4. End\n");
        int input = kb.nextInt();
        while(input != 4) {
            if(input == 1) {
                System.out.println("Number: ");
                list.add(kb.nextInt());
            } else if(input == 2) {
                list.remove();
            } else if(input == 3) {
                list.printList();
            }

            System.out.print("\n1. Add" +
                      "\n" + "2. Remove" +
                      "\n" + "3. Print" +
                      "\n" + "4. End\n");
            input = kb.nextInt();
        }
    }
}