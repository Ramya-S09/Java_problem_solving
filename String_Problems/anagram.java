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
        String s3=s1.toLowerCase();
        String s4=s2.toLowerCase();  
        char[] c=s3.toCharArray();
        char[] c1=s4.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if(Arrays.equals(c,c1))
        {
            System.out.print(s1+" and "+s2+" are Anagrams. ");
        }
        else
        {
            System.out.print(s1+" and "+s2+" are Not Anagrams. ");
        }
        
    }
}
