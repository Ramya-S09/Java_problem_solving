/*Write a program to check whether the string is isogram or not

Input Format

Accept the string as input

Constraints

NIL

Output Format

ISOGRAM / NOT ISOGRAM

Sample Input 0

orange
Sample Output 0

ISOGRAM
Sample Input 1

test
Sample Output 1

NOT ISOGRAM
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine().trim().toLowerCase().replaceAll("\\s", "");
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        int flag=1;
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {    flag=0;
                 break;
            }
        }
        if(flag==1)
        {
            System.out.print("ISOGRAM");
        }
        if(flag==0)
        {
            System.out.print("NOT ISOGRAM");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
