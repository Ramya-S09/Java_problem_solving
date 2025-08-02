class Solution {
    public static int largest(int[] a) {
        // code here
        int n=a.length;
        int largest=a[0];
        for(int i=1;i<n;i++)                                       //5  4                              //5  8
        {
            if(largest<a[i])
            {
                largest=a[i];
            }
        }
        return largest;
        
    }
}