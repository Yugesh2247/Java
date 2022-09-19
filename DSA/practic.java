public class practic {
    private Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        practic p = new practic();
        p.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);
        p.head.next = second;
        second.next = third;
        p.inAtFirst(50);
        p.inAtEnd(400);
        p.inAtAny(6, 500);
        p.delAtFirst();
        p.delAtEnd();
        p.delAtAny(4);

        p.display();
        System.out.println();
        if (p.search(p.head, 200)) {
            System.out.print("searching element found :)");
        } else {
            System.out.println("No elements fount :(");
        }
        System.out.println();
        p.length();

    }

    public boolean search(Node head, int data) {
        // Node key = new Node(data);
        Node temp = head;
        if (head == null) {
            return false;
        } else {
            while (temp != null) {
                if (temp.data == data) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public void delAtAny(int position) {
        Node temp = head;
        if (position == 1) {
            // Node temp = head;
            head = head.next;
            temp.next = null;
        } else {
            int count = 1;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            Node current = temp.next;
            temp.next = current.next;

        }
    }

    public void delAtEnd() {
        Node temp = head.next;
        Node previous = head;
        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
    }

    public void delAtFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        // return temp;

    }

    public void inAtAny(int position, int data) {
        Node n = new Node(data);
        Node temp = head;
        if (position == 1) {
            n.next = head;
            head = n;
        } else {
            int count = 1;
            while (count < position - 1) {
                temp = temp.next;
                count++;
            }
            Node previous = temp.next;
            temp.next = n;
            n.next = previous;
        }
    }

    public void inAtEnd(int data) {
        Node temp = head;
        Node n1 = new Node(data);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;

    }

    public void inAtFirst(int data) {
        Node ne = new Node(data);
        ne.next = head;
        head = ne;
    }

    public void length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        System.out.print("Length of the list: " + count);
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
