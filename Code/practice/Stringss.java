public class Stringss {
    public static void main(String[] args) {
        String str="Selena gomez";
        String st=new String("Selena Gomez");
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("Se"));
        System.out.println(str.endsWith("na"));
        System.out.println(str.replace("s", "s"));
        System.out.println(str.compareTo(st));
        System.out.println(str.equalsIgnoreCase(st));
        System.out.println(str.contains("gome"));
        System.out.println(str.contentEquals(st));
        System.out.println(st.charAt(3));
        System.out.println(st.indexOf("g"));
        System.out.println(str==st);
        System.out.println(str.equals(st));
        System.out.println(str.equalsIgnoreCase(st));
    }
    
}
