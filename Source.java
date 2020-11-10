import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        1 2 5 9 6 3 4 7 10 13 14 11 8 12 15 16
        // Declare the variable
        int n;
        int m;

        // Read the variable from STDIN
        n = in.nextInt();
        m= in.nextInt();
        int[][] inputArray=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                inputArray[i][j]= in.nextInt();
            }
        }

        // Output the variable to STDOUT
        printDiagonalForm(inputArray,n,m);
    }

    public static void printDiagonalForm(int[][] arr, int n, int m){
        int i=0;
        int j=0;
        int up=1;
        int k=0;
        while(k<n*m){
            if(up==1){
                while(i>=0 && j<m){
                    System.out.print(arr[i][j]);
                    k++;
                    j++;
                    i--;
                }

                if(i<0 && j<=m-1){
                    i=0;
                }
                if(j==m){
                    i=i+2;
                    j--;
                }
            }
            else{
                while(j>=0 && i<n){
                    System.out.print(arr[i][j]+" ");
                    k++;
                    j--;
                    i++;
                }
                if(j<0 && i<=n-1){
                    j=0;
                }
                if(i==n){
                    j=j+2;
                    i--;
                }
            }
            up= up==1?0:1;
        }
    }
}
