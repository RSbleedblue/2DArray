import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int q = sc.nextInt();
        convert2D(arr,size,p,q);
    }
    public static void convert2D(int arr[],int n,int p, int q){
        int arr2d[][] = new int[p][q];
        for(int i = 0; i < n; i++){
            int r = i / q;
            int c = i % q;
            arr2d[r][c] = arr[i];
        }
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
