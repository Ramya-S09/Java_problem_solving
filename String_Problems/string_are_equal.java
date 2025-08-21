/*
Write a program to check given string are equal or not equal

Input Format

Accept two string as a input

Constraints

NIL

Output Format

EQUAL OR NOT EQUAL

Sample Input 0

myslate
myslate
Sample Output 0

Equal  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine().trim();
        String s2=s.nextLine().trim();
        char[] c=s1.toCharArray();
        char[] c1=s2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if(Arrays.equals(c,c1))
        {
            System.out.print("Equal");
        }
        else
        {
            System.out.print("Not Equal");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
