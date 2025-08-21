/*
Write a program to replace all vowels with spaces

Input Format

Accept string as an input

Constraints

NIL

Output Format

Print the replaced string

Sample Input 0

Replace all vowels 
Sample Output 0

R pl c   ll v w ls 
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s1.replaceAll("[aeiouAEIOU]"," ");
        System.out.print(s2);
    }
}
