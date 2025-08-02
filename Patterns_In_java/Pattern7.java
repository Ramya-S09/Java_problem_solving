/*
    Write a program to display the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star pattern

Sample Input 0

4
Sample Output 0

*******
**   **
* * * *
*  *  *
* * * *
**   **
*******
 */

import java.util.Scanner;

public class Pattern7 {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        n=n*2-1;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {   if(row == 1 || row==n || col == 1 || col == n || row==col || row+col == n+1)
                  System.out.print("*");
                else
                  System.out.print(" ");
            }
            System.out.println();
        }
        s.close();
    }
}
