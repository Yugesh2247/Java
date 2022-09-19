public class single {
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
        single s = new single();
        s.head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        s.head.next = second;
        second.next = third;
        s.insertAtFirst(5);
        s.insertAtEnd(40);
        s.insertAtAny(3, 15);
        s.deleteFirst();
        s.deleteEnd();
        s.deleteAny(3);
        s.display();
        System.out.println();
        s.length();
        // System.out.println();
        if (s.searchKey(s.head, 30)) {
            System.out.print("search element found!");
        } else {
            System.out.print("No elements found");
        }
        // s.insertAtFirst(5);

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public void length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("Length :" + count);
    }

    public void insertAtFirst(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertAtEnd(int data) {
        Node new1 = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new1;
    }

    public Node deleteFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;

    }

    public boolean searchKey(Node head, int data) {
        Node temp = head;
        // Node key = new Node(data);
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public Node deleteEnd() {
        Node temp = head;
        Node previous = null;
        while (temp.next != null) {
            previous = temp;
            temp = temp.next;
        }
        previous.next = null;
        return temp;
    }

    public void deleteAny(int position) {
        Node data = new Node(position);
        if (position == 1) {
            head = head.next;
        }
        Node previous = head;
        int count = 1;
        while (count < position - 1) {
            previous = previous.next;
            count++;
        }
        Node temp = previous.next;
        previous.next = temp.next;
    }

    public void insertAtAny(int position, int data) {
        Node data1 = new Node(data);
        if (position == 1) {
            data1.next = head;
            head = data1;
        } else {
            Node previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            Node temp = previous.next;
            previous.next = data1;
            data1.next = temp;
        }
    }

}
