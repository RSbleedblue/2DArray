import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        interchange(arr,row,col);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void interchange(int arr[][],int n,int m){
        int first = 0;
        int last = n-1;
        int col = 0;
        while(col < m){
            int temp = arr[first][col];
            arr[first][col] = arr[last][col];
            arr[last][col] = temp;
            col++;
        }
    }
}
