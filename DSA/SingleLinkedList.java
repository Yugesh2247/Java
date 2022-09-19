public class SingleLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(10);
        s.head.next = second;
        second.next = third;
        third.next = fourth;
        // Insert a newnode at beginning
        ListNode newnode = new ListNode(23);
        newnode.next = s.head;
        s.head = newnode;
        // Insert a newnode at end
        ListNode newnode1 = new ListNode(45);
        fourth.next = newnode1;
        System.out.println();
        s.insertAtEnd(23);
        s.insert(1, 40);
        s.display();
        System.out.println("Length of single linked list :" + s.length());

    }

    public void display() { // to display the elements
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public int length() { // to find the length of list
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertAtEnd(int value) {
        ListNode a = new ListNode(value);
        if (head == null) {
            head = a;
            return;
        }
        ListNode temp = head;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = a;

    }

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode temp = previous.next;
            previous.next = node;
            node.next = temp;
        }
    }

}
