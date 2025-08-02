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

10101
01010
10101
01010
10101
Sample Input 1

6
Sample Output 1

101010
010101
101010
010101
101010
010101
 */
//PROGRAM

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if((row+col)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        s.close();
    }
}
