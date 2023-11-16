/*Once upon a time, there was a company that was developing a system to track the inventory levels of different products in different warehouses. 
They had a boolean matrix Mat of size M X N, where each cell represented the availability of a product in a specific warehouse. If the value of a cell was true (or 1), 
it meant that the product was available in that warehouse.

The company wanted to modify the matrix in such a way that if a cell, Mat[i][j], was true, then all cells in the ith row and jth column of the matrix would also be set to true. 
This would ensure that if a product was available in a particular warehouse, all the products in that row and column would also be considered available.

Can you write a program thet modify the matrix such that if a matrix cell Mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
*/
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
        modifyMatrix(arr,row,col);
         for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void modifyMatrix(int arr[][],int n,int m){
        int rowShadow[] = new int[n];
        int colShadow[] = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                    rowShadow[i] = 1;
                    colShadow[j] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(rowShadow[i] == 1 || colShadow[j] == 1){
                    arr[i][j] = 1;
                }
            }
        }
    }
}
