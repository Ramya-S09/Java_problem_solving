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

   *
  ***
 *****
*******
 */

import java.util.Scanner;

public class Pattern9 {
     public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n1=s1.nextInt();
        int n=n1*2-1;
        for(int row=1;row<=n1;row++)
        { 
            for(int s=1;s<=n1-row;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row*2-1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        s1.close();
        
    }
}
