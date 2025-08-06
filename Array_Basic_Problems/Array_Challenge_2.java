/*
Write a program to accept the array and count the number of odd and even numbers in the given array

Input Format

Number of elements followed by array as an input

Constraints

NIL

Output Format

Display the number of Odd and Even numbers in the given array

Sample Input 0

10
77 67 55 44 25 14 87 95 45 92
Sample Output 0

Odd = 7
Even = 3
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
        int n=s.nextInt();
        int[] arr=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(arr[i]%2==0)
           {
               cnt++;
           }
        }
        int n1=n-cnt;
        System.out.println("Odd = "+n1);
        System.out.println("Even = "+cnt);
    }
}
