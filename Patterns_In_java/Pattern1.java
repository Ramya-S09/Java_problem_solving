/*
   Print the following pattern

Input Format

Integer

Constraints

Input>0

Output Format

Star pattern

Sample Input 0

4
Sample Output 0

*
**
***
****
 */
import java.util.*;
public class Pattern1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
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
        s.close();
    }
}