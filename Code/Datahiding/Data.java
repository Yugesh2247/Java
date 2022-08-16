class Driver {
    private String name;
    private int age;
    private String Sex;
    private String lover;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        this.age = i;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String s) {
        this.Sex = s;
    }
    public String getLover() {
        return lover;
    }
    public void setLover(String lo) {
        this.lover = lo;
    }
}
class Data {
    public static void main(String[] args) {
        Driver c = new Driver();
        c.setName("selena");
        c.setAge(27);
        c.setSex("female");
        c.setLover("Yugesh");
        System.out.println("Name: " + c.getName());
        System.out.println("Age: " + c.getAge());
        System.out.println("Sex: " + c.getSex());
        System.err.println("Lover: " + c.getLover());

    }
}