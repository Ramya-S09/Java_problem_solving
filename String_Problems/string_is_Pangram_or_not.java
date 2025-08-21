/*

Write a c program to check whether a given string is Pangram or not

Input Format

Accept the string as input

Constraints

NIL

Output Format

Pangrams / Not Pangrams

Sample Input 0

The quick brown fox jumps over the lazy dog
Sample Output 0

Pangrams
Sample Input 1

this garden is very nice to look
Sample Output 1

Not Pangrams
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        String s1=s.nextLine().trim().toLowerCase();
        int cnt=0;
        for(char ch='a';ch<='z';ch++)
        {
            if(s1.contains(String.valueOf(ch)))
            {
                cnt++;
            }
        }
        if(cnt==26)
        {
            System.out.print("Pangrams");
        }
        else
        {
            System.out.print("Not Pangrams");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
