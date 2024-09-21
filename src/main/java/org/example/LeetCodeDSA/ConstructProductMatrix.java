package org.example.LeetCodeDSA;

public class ConstructProductMatrix {
    public static void main(String[] args) {
        int grid[][]={{1,2},{3,4}};
        grid=constructProductMatrix(grid);
        for(int i=0;i< grid.length;i++)
        {
            for (int j=0;j<grid[i].length;j++)
            {
                System.out.println(grid[i][j]);
            }
        }


    }
    public static int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long MOD = 12345;

        int[][] ans = new int[m][n];

        long prefixProduct = 1;

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                ans[i][j] = (int)(prefixProduct % MOD);
                prefixProduct = ((grid[i][j] * prefixProduct) % MOD);
            }
        }

        long suffixProduct = 1;

        for(int i=m-1; i>=0; i--){

            for(int j=n-1; j>=0; j--){

                ans[i][j] = (int)((ans[i][j] * suffixProduct) % MOD);
                suffixProduct = ((grid[i][j] * suffixProduct) % MOD);
            }
        }

        return ans;
    }
}
