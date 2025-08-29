import java.util.Scanner;

class Print_n_nathural_numbers
{
    public static void natural(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        natural(i+1,n);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        natural(i,n);
        s.close();
    }
}