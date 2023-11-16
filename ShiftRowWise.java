import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int rotation = sc.nextInt();
        shiftRow(arr,rotation,size);
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void shiftRow(int arr[][],int k,int n){
        k = n-k;
        for(int i = 0; i < n; i++){
            reverse(arr[i],n-k,n-1);
            reverse(arr[i],0,n-k-1);
            reverse(arr[i],0,n-1);
        }
    }
    public static void reverse(int arr[],int si,int ei){
        while(si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
}
