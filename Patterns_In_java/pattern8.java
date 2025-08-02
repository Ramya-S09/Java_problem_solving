/*
  Write a program to display the following pattern.

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
 *****
  ***
   *
 */

import java.util.Scanner;

public class pattern8 {
     public static void main(String[] args) {
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        n=n*2-1;
        for(int row=1;row<=n;row++)
        {  
            for(int s=2;s<=row;s++)
            {
                System.out.print(" ");
            }
            for(int col=row;col<=n;col++)
            {
                System.out.print("*");
            }
            n=n-1;
            System.out.println();
        }
        s1.close();
    }
}
