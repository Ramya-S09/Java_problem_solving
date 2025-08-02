/*
    Print the Following Pattern

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

Star Pattern

Sample Input 0

4
Sample Output 0

*
**
***
****
****
***
**
*
 */

import java.util.Scanner;

public class Pattern17 {
    
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=n;row>=1;row--)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}
