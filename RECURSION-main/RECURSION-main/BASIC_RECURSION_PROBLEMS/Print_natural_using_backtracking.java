import java.util.*;
public class Print_natural_using_backtracking {
    public static void natural(int i,int n)
    {
        if(i==0)
        {
            return;
        }
        natural(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        natural(n,n);
        s.close();
    }
}

