import javax.sound.midi.SysexMessage;

public class Primenumber {
    public static void main(String[] args) {
        int n=11;
        boolean flag=false;
        for (int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=true;
            }
        }
        if(flag)
        {
            System.out.println("not an prime number ");
        }
        else{
            System.out.print("prime");
        }
    }
}
