/*
   Print the Following Plus Pattern

Input Format

Integer(ODD NUMBER)

Constraints

NIL

Output Format

Star Format

Sample Input 0

11
Sample Output 0

     *     
     *
     *
     *
     *
***********
     *
     *
     *
     *
     *
Sample Input 1

12
Sample Output 1

      *     
      *     
      *     
      *     
      *     
      *     
************
      *     
      *     
      *     
      *     
      *     
 */

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=0;
        int n2=0;
        if(n%2!=0)
        {
         n1=(n+1)/2;   
        }
        else
        {
         n2=(n/2)+1;   
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==n1 || j==n1 || i==n2 || j== n2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
