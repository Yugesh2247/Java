
public class Cons3 {
    int accountno;
    String bank;
    String branch;
    String holder;

    Cons3(int accountno, String bank, String branch, String holder) {
        this.accountno = accountno;
        this.bank = bank;
        this.branch = branch;
        this.holder = holder;
        System.out.println("Account details");
        System.out.println();
        System.out.println("accountno:" + accountno + "\n" + "Bank:" + bank + "\n" + "Branch:" + branch + "\n"
                + "Holder:" + holder);

    }

    public static void main(String[] args) {
        Cons3 c = new Cons3(123, "UnionBAnkOfIndia", "IFSC", "Selena");
        System.out.println("__________________________________________________________________________");
        Cons3 c1 = new Cons3(124, "UnionBAnkOfIndia", "IFSC", "Yugesh");
        System.out.println("__________________________________________________________________________");
        Cons3 c2 = new Cons3(125, "UnionBAnkOfIndia", "IFSC", "Poco");
    }

}
