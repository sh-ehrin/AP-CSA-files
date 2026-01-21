package ap;

public class Learning2DArrays {
    public static void main(String[] args){
        
        LearningArray printArray = new LearningArray();
        
        int[][] mat = new int[3][4];
        String[][] mat2 = new String[2][2];
        int[][] grid = {{-1,2,3},
                        {8,-4,9},
                        {9,5,-6},
                        {6,-9,4}};
        int[][] table1 = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
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
        
        System.out.println(Avg2D(table1));
        
//        double[][] table = new double[36][45];
//        
//        for (int r = 0; r < table.length; r++){
//            for ( int c = 0; c < table[r].length; c++){
//                table[r][c] = 3.14;
//            }
//        }
//        
//        print2Double(table);
//        
//        for (int c = 0; c < table[1].length; c++){
//            table[1][c] += 10.1;
//        }
//        print2Double(table);
//        
//        for (int c = 0; c < table[2].length; c++){
//            table[2][c] *= -1;
//        }
//        print2Double(table);
        System.out.println();
        System.out.println(countNegs(grid));
        
        System.out.println();
        printArray.printArrayInt((majorDiag(table1)));
        
        System.out.println();
        printArray.printArrayInt((minorDiag(table1)));
        
        System.out.println();
        print2D(colMajorToRowMajor(grid));
        
        
        System.out.println();
        print2D(posToNeg2D(grid, 1, 1));
        
        System.out.println();
        printArray.printArrayInt(rowMajorOrder(grid));
        
        rotateUp(grid);
        
        System.out.println();
        printArray.printArrayInt(sumOfCols(table1, 2, 4));
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
        
        for (int r = 0; r < ans.length; r++){
            for (int c = 0; c < ans[r].length; c++){
                ans[r][c] = g[c][r];
            }
        }
        return ans;
    }
    
    public static int[][]posToNeg2D(int[][] mat, int row, int col){
        
        for (int r = row-1; r <= row+1; r++){
            for (int c = col-1; c <= col+1; c++){
                if (r >= 0 && r < mat.length && c >= 0 && c < mat[r].length){
                    if (mat[r][c] != mat[row][col]){
                        mat[r][c] *= -1;
                    }
                }
            }
        }
        return mat;
    }
    
    public static int[] rowMajorOrder(int[][] nums){
        int len = nums.length*nums[0].length;
        int[] ans = new int[len];
        int count = 0;
        
        for (int r = 0; r < nums.length; r++){
            for (int c = 0; c < nums[r].length; c++){
                ans[count] = nums[r][c];
                count++;
            }
        }
        return ans;
    }
    
    public static void rotateUp(int[][] g){
        int[] a = new int[g[0].length];
        
        for (int i = 0; i < g[0].length; i++){
            a[i] = g[0][i]; 
        }
        
        for (int r = 0; r < g.length-1; r++){
            for (int c = 0; c < g[r].length; c++){
                g[r][c] = g[r+1][c];
            }
        }
        
        for (int c = 0; c < g[0].length; c++){
            g[g.length-1][c] = a[c];
        }
        
        for (int r = 0; r < g.length; r++){
            System.out.println();
            for (int c = 0; c < g[r].length; c++){
                System.out.print(g[r][c] + ", ");
            }
        }
        System.out.println();
    }
    
    public static int[] sumOfCols(int[][] mat, int beginCol, int endCol){
        //new int array of length of columns
        int[] sums = new int[endCol-beginCol];
        
        //loop through each row of each column
        for (int c = beginCol; c < endCol; c++){
            for (int r = 0; r < mat.length; r++){
                sums[c - beginCol] += mat[r][c];
            }
        }
        return sums;
    }
}

