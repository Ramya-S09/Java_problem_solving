/*
   Hollow Square Pattern with X pattern inside(Made of 0's and 1's)

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

MATRIX

Sample Input 0

7
Sample Output 0

1111111
1100011
1010101
1001001
1010101
1100011
1111111
Sample Input 1

8
Sample Output 1

11111111
11000011
10100101
10011001
10011001
10100101
11000011
11111111
 */

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==1 || col == 1 || row==n || col == n|| row==col || row+col==n+1)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
       s.close(); 
    }
}
