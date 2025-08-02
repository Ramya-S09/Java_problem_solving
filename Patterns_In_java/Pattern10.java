/*
   Write a program to display the following pattern

Input Format

Integer

Constraints

Input>0

Output Format

Star pattern

Sample Input 0

4
Sample Output 0

*     *
 *   * 
  * *  
   *   
  * *  
 *   * 
*     *
 */

import java.util.Scanner;

public class Pattern10 {
     public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n1=s1.nextInt();
        n1=n1*2-1;
        for(int row=1;row<=n1;row++)
        { 
            for(int col=1;col<=n1;col++)
            {
                if(row==col|| row+col==n1+1)
                   System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        s1.close();
    }
}
