/*
 Write a program to display the following pattern

Input Format

Integer

Constraints

input>0

Output Format

Star Pattern

Sample Input 0

5
Sample Output 0

1
24
135
2468
13579

 */
import java.util.*;
public class Pattern5 {
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int var;
        for(int row=1;row<=n;row++)
        {   if(row%2==0)
            {
            var=2;
            }
            else
            {
                var=1;
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print(var);
                var+=2;
            }
         var=0;
            System.out.println();
        }
        s.close();
    }
    
}
