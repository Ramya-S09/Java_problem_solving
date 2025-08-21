/*Given a password, check whether it is strong or weak. A strong password is one that has

at least one upper case letter at least one lower case letter at least one digit at least one special character length is at least 10

Input Format

Accept a string as a input

Constraints

nil

Output Format

Strong password or Weak password

Sample Input 0

MySlate@_12
Sample Output 0

Strong password
  */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int u=1,d=1,s=1,l=1;
        if(s1.length()>=8)
        {
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>='A' && ch<='Z')
            {
                u=0;
            }
            else if(Character.isDigit(ch))
            {
                d=0;
            }
            else if(ch>='a' && ch<='z')
            {
                l=0;
            }
            else
            {
                s=0;
            }
        }
            int n=u+l+s+d;
            if(n==0)
            {
              System.out.print("Strong password");  
            }
            else
            {
               System.out.print("Weak password"); 
            }
        }
        else
        {
            System.out.print("Weak password");
        }
        
    }
}
