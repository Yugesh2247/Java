import java.util.concurrent.CountDownLatch;

class Double {
    private Node head;
    private Node tail;
    private int length;

    private class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Double() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public static void main(String[] args) {
        Double s = new Double();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.inAtFirst(15);
        s.inAtEnd(50);
        s.inAtAny(4, 25);
        s.delAtFirst();
        s.delAtAny(4);
        s.delAtEnd();
        s.display();
        System.out.println();
        s.length();

    }

    public void length() {
        int count = 0;
        Node tmep = head;
        while (tmep != null) {
            tmep = tmep.next;
            count++;
        }
        System.out.println("length of the double linked list :" + count);
    }

    public void delAtAny(int position) {
        if (position == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            head.previous = null;
        } else {
            Node h = head;
            int count = 1;
            while (count < position - 1) {
                h = h.next;
                count++;
            }
            Node current = h.next;
            h.next = current.next;

        }
    }

    /*
     * public void delAtEnd() {
     * Node temp = head;
     * Node current = null;
     * while (temp.next != null) {
     * current = temp;
     * temp = temp.next;
     * }
     * temp.previous = null;
     * current.next = null;
     * 
     * }
     */
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
        head.previous = null;
    }

    public void inAtAny(int position, int data) {
        Node n2 = new Node(data);
        if (position == 1) {
            n2.next = head;
            head.previous = n2;
            n2.previous = null;
            head = n2;
        } else {
            Node current = head;
            int count = 1;
            while (count < position - 1) {
                current = current.next;
                count++;
            }
            Node temp = current.next;
            current.next = n2;
            n2.previous = current;
            n2.next = temp;
            temp.previous = n2;
        }
    }

    public void inAtEnd(int data) {
        Node n1 = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
        n1.previous = temp;
        tail = n1;

    }

    public void inAtFirst(int data) {
        Node n = new Node(data);
        n.next = head;
        n.previous = null;
        head.previous = n;
        head = n;
    }

    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newnode;
            newnode.previous = tail;
            tail = newnode;
            tail.next = null;

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
