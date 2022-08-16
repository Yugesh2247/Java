public class ArrayRev { 
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        System.out.println("Before reverse");
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("");
        System.out.println("After reverse");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
        
    }
    
}
