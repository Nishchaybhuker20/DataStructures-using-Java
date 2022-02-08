import java.util.*;
import java.lang.*;

public class CircularArraySum{
    public static void print(int a[], int n, int ind){
        int[] b = new int [(2 * n)];

        for(int i = 0; i<n; i++)
            b[i] = b[n+i] = a[i];

        for(int i = ind; i<n + ind; i++)
            System.out.print(b[i]+ " ");
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = s.nextInt();
        int arr [] = new int[n];
        System.out.println("enter elements");

        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
        for(int i: arr){
            System.out.println(i);
        }
        static int sum(){
            int sum = 0;
            int i;

            for(i = 0; i<arr.length; i++)
                sum += arr[i];
            return sum;
        }
        System.out.println(sum());
    }
}