public class Customer {
    String customerId;
    String customerName;
    long contactNumber;
    String address;

    Customer() {

    }

    Customer(String customerId, String customerName, long contactNumber, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    Customer(String customerId, long contactNumber, String address) {
        this.customerId = customerId;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getcustomerId() {
        return customerId;
    }

    public void setcustomerId(String s) {
        this.customerId = s;
    }

    public String getcustomerName() {
        return customerName;
    }

    public void setcustomerName(String name) {
        this.customerName = name;
    }

    public long getcontactNumber() {
        return contactNumber;
    }

    public void setcontactNumber(long num) {
        this.contactNumber = num;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;

    }

    public static void main(String[] args) {
        Customer c = new Customer();
        Customer c1 = new Customer("1", "yugesh", 7569372152L, "Dasarpalli");
        Customer c2 = new Customer("2", 91775235L, "Chittoor");
        c1.setcustomerId("1");
        c1.setcustomerName("Yugesh");
        c1.setcontactNumber(12345);
        c1.setaddress("Bangalore");
        System.out.println("Customer Details:");
        System.out.println(c1.getcustomerId());
        System.out.println(c1.getcustomerName());
        System.out.println(c1.getcontactNumber());
        System.out.println(c1.getaddress());

    }
}
