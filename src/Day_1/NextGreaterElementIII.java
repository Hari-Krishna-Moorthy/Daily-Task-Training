package Day_1;

import java.util.Arrays;

public class NextGreaterElementIII {
    public static int nextGreaterElement(int n) {
        int count = 0, rev = 0, temp  =n;
        while(temp > 0) {
            rev = rev*10 + temp%10;
            temp/=10;
            count++;
        }
        int arr[] = new int[count];
        for(int i=0;i<count;i++) {
            arr[i] = rev%10;
            rev/=10;
        }
        int X = arr.length - 1;
        while(X > 0 && arr[X-1] >= arr[X]){
            X--;
        }
        if(X-1 < 0) return -1;

        int Y = arr.length-1;
        while(Y > (X-1) && arr[Y] <= arr[X-1]){
            Y--;
        }

        swap(arr, X-1, Y);
        reverse(arr, X);
        int ans = 0;
        for(X=0;X<arr.length;X++){
            if(ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && arr[X] > 7))
                return -1;
            if(ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && arr[X] < -8))
                return -1;
            ans = ans * 10 + arr[X];
        }
        return ans == n ? -1 : ans;
    }
    private static void reverse(int[] arr, int i){
        int j = arr.length - 1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println(nextGreaterElement(12));
        System.out.println(nextGreaterElement(21));
    }
}
