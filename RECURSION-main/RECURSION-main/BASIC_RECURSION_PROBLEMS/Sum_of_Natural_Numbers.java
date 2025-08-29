import java.util.Scanner;
public class Sum_of_Natural_Numbers {
    public static void natural(int i,int n,int sum)
    {
        if(i>n)
        {    
            System.out.println(sum);
            return;
        }
        sum+=i;
        natural(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        int sum=0;
        natural(i,n,sum);
        s.close();
    }
}
