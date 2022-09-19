import java.util.Scanner;
import javafx.scene.chart.PieChart.Data;

class test {
    private Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        test t = new test();
        t.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        t.head.next = second;
        second.next = third;
        t.insertFIrst(5);
        t.insertEnd(4);
        t.insertAtAny(3, 8);
        t.deleteFIrst();
        t.deleteEND();
        t.deleteATANY(2);
        t.display();
        System.out.println();
        // Node reverse = t.reverse(t.head);
        // t.display(reverse);
        t.length();
        System.out.println();
        if (t.find(t.head, 3)) {
            System.out.println("Searching element found!..");
        } else {
            System.out.print("Searching element not found");
        }

    }

    private void display(test.Node reverse) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public Node reverse(Node head) {
        if (head == null) {
            return null;
        } else {
            Node current = head;
            Node previous = null;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            return previous;
        }
    }

    public void insertFIrst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;

    }

    public void insertEnd(int value) {
        Node new1 = new Node(value);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new1;
    }

    public void insertAtAny(int position, int value) {
        Node new2 = new Node(value);
        if (position == 1) {
            new2.next = head;
            head = new2;
        }
        Node previous = head;
        int count = 1;
        while (count < position - 1) {
            previous = previous.next;
            count++;
        }
        Node temp = previous.next;
        previous.next = new2;
        new2.next = temp;
    }

    public void deleteFIrst() {
        Node newnode = head;
        head = head.next;
        newnode.next = null;

    }

    public void deleteEND() {
        Node previous = head;
        Node temp = head.next;
        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
    }

    public void deleteATANY(int position) {
        if (position == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null;
        } else {
            int count = 1;
            Node temp = head;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            Node temp1 = temp.next;
            temp.next = temp1.next;
        }
    }

    public void length() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.print("Length of the single linked lisk: " + count);
    }

    public boolean find(Node head, int data) {
        if (head == null) {
            return false;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}