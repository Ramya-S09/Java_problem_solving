/*
   Box filled with 1's and 0's forming a plus sign

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

MATRIX

Sample Input 0

5
Sample Output 0

11011
11011
00000
11011
11011
Sample Input 1

8
Sample Output 1

11100111
11100111
11100111
00000000
00000000
11100111
11100111
11100111
 */

import java.util.Scanner;

public class Pattern12 {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=0;
        int n2=0;
        int n3=0;
        if(n%2==0)
        {   n2=n/2;
            n3=n2+1;
        }
        else
        {
         n1=(n+1)/2;   
        }
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==n1 || col == n1|| row==n2 || col==n3 || row==n3 || col==n2)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
      s.close();
    }
}
