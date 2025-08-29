import java.util.Scanner;

public class Reverse_an_ar {
    public static void reverse(int l, int r, int[] arr) {
        if (l > r) {
            for (int e : arr) {
                System.out.print(e+" ");
            }
            return;
        }
        swap(l, r, arr);
        reverse(l + 1, r - 1, arr); 
    }

    public static void swap(int l, int r, int[] arr) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        reverse(0, n - 1, arr);
        s.close();
    }
}
