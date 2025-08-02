/*
   Box pattern made of center as 0 and remaining filled in 1's

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

MATRIX

Sample Input 0

5
Sample Output 0

11111
11111
11011
11111
11111
Sample Input 1

6
Sample Output 1

111111
111111
110011
110011
111111
111111
 */

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=0;
        int n2=0;
        int n3=0;
        if(n%2==0)
        {
            n2=n/2;
            n3=n2+1;    
        }
        else
        {
            n1=(n+1)/2;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i==n1 && j==n1) || (i==n2 && j==n2)||(i==n3 && j==n3) || (i==n2 && j==n3)||(i==n3 && j==n2))
                    System.out.print("0");
                else
                   System.out.print("1");
            }
            System.out.println();
        }
        s.close();
    }
}
