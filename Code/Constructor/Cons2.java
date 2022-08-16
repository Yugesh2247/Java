public class Cons2 {
    String name;
    int age;
    String gender;
    String martial;

    Cons2(String name, int age, String gender, String martial) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.martial = martial;
        System.out.println(
                "Name:" + name + "\n " + "Age:" + age + "\n " + "Gender:" + gender + "\n " + "Martial:" + martial);
    }

    public static void main(String[] args) {
        Cons2 c = new Cons2("Selena", 25, "Female", "MARRIED");

    }
}
