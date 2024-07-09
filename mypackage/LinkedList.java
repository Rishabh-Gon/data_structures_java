package mypackage;

import java.util.Scanner;
import mypackage.Node;

class LinkedList {
    Scanner sc = new Scanner(System.in);
    Node head = null;

    public void createNodeFirst() {
        System.out.println("Enter data");
        int n = sc.nextInt();
        Node newNode = new Node(n);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void createNodeLast() {
        System.out.println("Enter data");
        int n = sc.nextInt();
        Node newNode = new Node(n);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node nextNode = this.head;
            while (nextNode.next != null) {
                nextNode = nextNode.next;
            }
            nextNode.next = newNode;
        }
    }

    public void printdata() {
        Node newNode = this.head;
        while (newNode != null) {
            System.out.println("Element is " + newNode.data);
            newNode = newNode.next;
        }

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        LinkedList object = new LinkedList();
        while (true) {
            System.out.println("***MAIN MENU***");
            System.out.println("Press 1 for new Node at first");
            System.out.println("Press 2 for new Node at end");
            System.out.println("Press 3 for printing the Nodes");
            System.out.println("Press 4 for exit");
            int ch = obj.nextInt();
            if (ch == 1) {
                object.createNodeFirst();
            } else if (ch == 2) {
                object.createNodeLast();
            } else if (ch == 3) {
                object.printdata();
            } else if (ch == 4) {
                break;
            } else {
                System.out.println("Wrong choice");
            }
        }
        obj.close();
    }
}