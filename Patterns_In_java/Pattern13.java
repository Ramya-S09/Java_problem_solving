/*
    Box made of 1's and filled with 0's

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
10001
10001
10001
11111
 */

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1|| i== n|| j==1||j==n)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
