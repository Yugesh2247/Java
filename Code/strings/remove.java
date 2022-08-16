class remove {
    public static void main(String[] args) {
        String st = "";
        String str = "Sai@$%Selena*&&^&^@&^*^(#^*^@)";
        int n = str.length();
        st = str.replaceAll("[a-zA-Z0-9]", "");
        System.out.println(st);
        str = str.replaceAll("\\W+", "");
        System.out.println(str);

    }

}