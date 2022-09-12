import java.util.Scanner;

class RRT {
    int ticketNo;
    String raisedBy;
    String assignedTo;
    int priority;
    String project;
    public char[] getticketNo;
    public char[] getraisedBy;
    public char[] getassignedTo;

    RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project) {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;

    }

    public String getproject() {
        return null;
    }

    public int getpriority() {
        return 0;
    }
}

public class cpa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RRT[] arr = new RRT[4];
        for (int i = 0; i < 4; i++) {
            int ticketNo = sc.nextInt();
            sc.nextLine();
            String raisedBy = sc.nextLine();
            String assignedTo = sc.nextLine();
            int priority = sc.nextInt();
            sc.nextLine();
            String project = sc.nextLine();
            arr[i] = new RRT(ticketNo, raisedBy, assignedTo, priority, project);
        }
        String inputproject = sc.nextLine();
        RRT result = getHighestPriorityTicket(arr, inputproject);
        if (result == null) {
            System.out.println("No such Ticekts.");
        } else {
            System.out.println(result.getticketNo);
            System.out.println(result.getraisedBy);
            System.out.println(result.getassignedTo);
        }

    }

    public static RRT getHighestPriorityTicket(RRT[] arr, String inputproject) {
        RRT x = null;
        int pr = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getproject().equalsIgnoreCase(inputproject)) {
                if (arr[i].getpriority() < pr) {
                    x = arr[i];
                    pr = arr[i].getpriority();
                }
            }
        }
        if (x != null) {
            return x;
        } else {
            return null;
        }
    }

}
