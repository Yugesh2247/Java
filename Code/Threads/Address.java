public class Address {
    String doorNo;
    String street;
    String city;
    int zipcode;

    Address(String doorNo, String street, String city, int zipcode) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;

    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setdoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setstreet(String street) {
        this.street = street;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public int getzipcode() {
        return zipcode;
    }

    public void setzipcode(int zipcode) {
        this.zipcode = zipcode;

    }

    public static void main(String[] args) {
        Address a = new Address("1-49", "Dasarapalli", "chittoor", 517422);
        a.setdoorNo("1-49");
        a.setstreet("Dasarapalli");
        a.setcity("yadamari");
        a.setzipcode(517422);
        System.out.println(a.getDoorNo());
        System.out.println(a.getStreet());
        System.out.println(a.getcity());
        System.out.println(a.getzipcode());
    }

}
