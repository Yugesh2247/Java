import java.util.*;

class Flower {
    int flowerId;
    String flowerName;
    int price;
    int rating;
    String type;

    Flower(int flowerId, String flowerName, int price, int rating, String type) {
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }
}

public class cpa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        Flower[] arr = new Flower[4];
        for (int i = 0; i < 4; i++) {
            int flowerId = sc.nextInt();
            sc.nextLine();
            String flowerName = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            int rating = sc.nextInt();
            sc.nextLine();
            String type = sc.nextLine();
            arr[i] = new Flower(flowerId, flowerName, price, rating, type);
        }
        String inputparameter = sc.nextLine();
        int result = findMinPriceByType(arr, inputparameter);
        if (result == 0) {
            System.out.println("There is no flower from the given type");
        } else {
            System.out.println(result);
        }

    }

    public static int findMinPriceByType(Flower[] arr, String inputparameter) {
        ArrayList al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].type.equalsIgnoreCase(inputparameter) && arr[i].rating > 3) {
                al.add(arr[i].price);
            }
        }
        Collections.sort(al);
        return (int) al.get(0);

    }
}
