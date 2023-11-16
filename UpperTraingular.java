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
        upperTriangle(arr);    
    }
    public static void upperTriangle(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(j >= i){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
