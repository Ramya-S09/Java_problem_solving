/*Write a program to count the number of upper-case characters in a given string

Input Format

Accept string as an input

Constraints

NIL

Output Format

Print the count of Uppercase characters

Sample Input 0

BeauTIfull Life
Sample Output 0

4
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c>=65 && c<=90)
            {
                cnt++;
            }
       }
        System.out.print(cnt);
    }
}
