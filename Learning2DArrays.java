/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShehrinHabib
 */
public class Learning2DArrays {
    public static void main(String[] args){
        LearningArray printArray = new LearningArray();
        
        int[][] mat = new int[3][4];
        String[][] mat2 = new String[2][2];
        int[][] grid = {{1,2,3},
                        {8,4,9},
                        {9,5,6},
                        {6,9,4}};
        int[][] table1 = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};
        int[][] jagged = { //formatting not on ap exam
            {10,11,12},
            {1,2},
            {4,5,6,7},
            {8,9,10,11,12}
        };
        
        int numRows = mat.length;
        System.out.println(numRows);
        int numColumns = mat[0].length;
        System.out.println(numColumns);
        
        System.out.println(mat);
        
        print2D(jagged);
        
        System.out.println(Avg2D(grid));
        
        double[][] table = new double[36][45];
        
        for (int r = 0; r < table.length; r++){
            for ( int c = 0; c < table[r].length; c++){
                table[r][c] = 3.14;
            }
        }
        
        print2Double(table);
        
        for (int c = 0; c < table[1].length; c++){
            table[1][c] += 10.1;
        }
        print2Double(table);
        
        for (int c = 0; c < table[2].length; c++){
            table[2][c] *= -1;
        }
        print2Double(table);
        
        System.out.println(countNegs(table1));
        
        printArray.printArrayInt((majorDiag(table1)));
        
        printArray.printArrayInt((minorDiag(table1)));
        
        print2D(colMajorToRowMajor(grid));
    }
    
    public static void print2D(int[][] arr){
        
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c]+", ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void print2Double(double[][] arr){
        
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c]+", ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static double Avg2D(int[][] arr){
        double total = 0;
        double nums = 0;
        
        for (int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length; c++){
                total += arr[r][c];
                nums++;
            }
        }
        return total/nums;
    }
    
    public static int countNegs(int[][] mat){
        int negs = 0;
        for (int r = 0; r < mat.length; r++){
            for (int c = 0; c < mat[r].length; c++){
                if (mat[r][c] < 0){
                    negs++;
                }
            }
        }
        return negs;
    }
    
    public static int[] majorDiag(int[][] mat){
        int [] major = new int[mat.length];
        
        for (int r = 0; r < mat.length; r++){
            major[r] = mat[r][r];
        }
        return major;
    }
    
    public static int[] minorDiag(int[][] mat){
        int [] minor = new int[mat.length];
        int c = mat[0].length-1;
        
        for (int r = 0; r < mat.length; r++){
            minor [r] = mat[r][c];
            c--;
        }
        return minor;
    }
    
    public static int[][] colMajorToRowMajor(int[][] g){
        int[][] ans = new int[g[0].length][g.length];
        int c = 0;
        for (int i = 0; i < g.length; i++){
            ans[i][c] = g[c+1][i];
            c++;
        }
        return ans;
    }
}

