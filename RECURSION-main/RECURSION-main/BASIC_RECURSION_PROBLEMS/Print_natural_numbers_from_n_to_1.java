import java.util.Scanner;

public class Print_natural_numbers_from_n_to_1 {
     public static void natural(int i,int n)
    {
        if(i==0)
        {
            return;
        }
        System.out.println(i);
        natural(n-1,n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        natural(n,n);
        s.close();
    }
}
