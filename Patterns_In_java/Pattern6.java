/*
   Write a program to display the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star pattern

Sample Input 0

5
Sample Output 0

*****
*   *
*   *
*   *
*****
 */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==1 || row==n|| col==1 || col==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        s.close();
    }
}
