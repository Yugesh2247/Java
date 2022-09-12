import java.util.Scanner;

class FootWear {
    private int footwearId;
    String footwearName;
    String footwearType;
    private int price;

    FootWear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    public void setfootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public void setfootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public void setfootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public int getfootwearId() {
        return footwearId;
    }

    public String getfootwearName() {
        return footwearName;
    }

    public String getfootwearType() {
        return footwearType;
    }

    public int getprice() {
        return price;
    }

}

public class cpa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FootWear[] arr = new FootWear[n];
        for (int i = 0; i < n; i++) {
            int footwearId = sc.nextInt();
            sc.nextLine();
            String footwearName = sc.next();
            String footwearType = sc.next();
            int price = sc.nextInt();
            arr[i] = new FootWear(footwearId, footwearName, footwearType, price);
        }
        String type = sc.nextLine();
        String brand = sc.nextLine();
        int count = getCountByType(arr, type);
        System.out.println(count);
        FootWear footwear = getSecondHighestPriceByBrand(arr, brand);

    }

    public static int getCountByType(FootWear[] arr, String type) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i].footwearType.equalsIgnoreCase(type)) {
                count += 1;
            }
        }
        if (count > 0) {
            return count;
        }
        return 0;
    }

    public static FootWear getSecondHighestPriceByBrand(FootWear[] arr, String name) {
        for (int i = 0; i < 5; i++) {
            if (arr[i].footwearName.equalsIgnoreCase(name)) {
                
            }
        }

    }
}
