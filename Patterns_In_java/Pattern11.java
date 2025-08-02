/*
   Alternate rows of 1's and 0's

Input Format

Accept an integer as an input

Constraints

NIL

Output Format

MATRIX

Sample Input 0

5
Sample Output 0

11111
00000
11111
00000
11111
 */

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print(row%2);
            }
            System.out.println();
        }
        s.close();
    }
}
