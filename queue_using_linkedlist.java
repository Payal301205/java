package project;

import java.util.Scanner;

public class queue_using_linkedlist {

    class GetNode {
        int data;
        GetNode next;

        GetNode(int data) {
            this.data = data;
            next = null;
        }
    }

    GetNode front = null;
    GetNode rear = null;

    Scanner sc = new Scanner(System.in);

    // ENQUEUE
    void enqueue() {

        System.out.println("Enter element:");
        int data = sc.nextInt();

        GetNode newnode = new GetNode(data);

        if (front == null) {
            front = rear = newnode;
        } else {
            rear.next = newnode;
            rear = newnode;
        }

        System.out.println(data + " inserted");
    }

    // DEQUEUE
    void dequeue() {

        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " deleted");

        front = front.next;

        // if queue becomes empty
        if (front == null) {
            rear = null;
        }
    }

    // DISPLAY
    void display() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        GetNode temp = front;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // ISEMPTY
    void isempty() {

        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue is not empty");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        queue_using_linkedlist obj =
                new queue_using_linkedlist();

        while (true) {

            System.out.println("\n------TASKS------");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.IsEmpty");
            System.out.println("0.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    obj.enqueue();
                    break;

                case 2:
                    obj.dequeue();
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    obj.isempty();
                    break;

                case 0:
                    System.out.println("Exited");
                    System.exit(0);
            }
        }
    }
}