/* 
Print the following pattern

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
   *****
  *****
 *****
*****

*/

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int s=1;s<=n-row;s++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=n;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        s1.close();
    }
}
