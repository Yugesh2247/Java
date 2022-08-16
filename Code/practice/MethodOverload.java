public class MethodOverload {
    public static void main(String[] args) {
        add(3,5);
        add(7,8,9);
    }
    public static void add(int a, int b){
        int c=a+b;
        System.out.println(c);

    }
    public static void add(int a, int b,int c){
        int d=a+b+c;
        System.out.println(d);

    }
    
}
