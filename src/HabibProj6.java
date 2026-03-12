/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mirah
 */
public class HabibProj6 {

    public static void main(String[] args) {
        //1
        double[][] mat = {{0.3, 0.7, 0.8},
        {1.1, 1.4, 0.4},
        {0.2, 0.5, 0.1},
        {0.9, 0.6, 1.6}};

        HabibProj6 test = new HabibProj6();
        System.out.println(test.minFromSection(mat, 1, 3, 0, 1));

        Learning2DArrays prints = new Learning2DArrays();
        LearningArray print = new LearningArray();

        //2
        String[][] t = new String[2][3];
        String[] s = {"hello", "blah", "boom", "elephant"};
        prints.print2String(twoCharsTo2D(t, s));

        //3a
        int[] nums = {90, 60, 75, 80, 80};
        System.out.println(findAverage(nums));

        //3b
        int[][] grades = {{80, 90, 90, 100, 70},
        {90, 60, 75, 80, 80},
        {100, 90, 96, 98, 99}};
        print.printArrayDouble(rowAvg(grades));

        //3c
        String[] r = {"Joe", "Kim", "Chris"};
        System.out.println(bestAverage(r, grades));

        //4a
        int[][] g1 = {{9, 8, 7, 6},
        {5, 4, 2, 1},
        {3, 9, 2, 3}};

        prints.print2D(removeRow(g1, 0));

        //4b
        prints.print2D(removeCol(g1, 0));

        //4c
        prints.print2D(removeRowCol(g1, 0, 1));

        //5a
        String[][] table = {{"X", "O", "O", "X", "X", "X", "O", "O", "O"},
                            {"O", "O", "O", "O", "X", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "O", "O", "X", "X", "X"},
                            {"O", "O", "X", "O", "O", "O", "X", "O", "O"},
                            {"X", "X", "X", "O", "O", "O", "O", "O", "O"},
                            {"O", "O", "O", "O", "X", "O", "O", "O", "O"},
                            {"O", "O", "O", "X", "X", "X", "O", "O", "X"}};
        
        System.out.println(toBeChanged(2,4, table));
        
        //5b
        System.out.println();
        prints.print2String(change2DArray(table));
        
        //6
        char[][] lets = {{'s','h','u','j','r','x','e','l'},
                         {'x','q','a','i','x','r','h','a'}};
        prints.print2Char(soDramatic(lets));
        
        //7
        prints.print2D(reverseColMajor(g1));
    }

    //1
    public double minFromSection(double[][] nums, int startRow, int endRow, int startCol, int endCol) {

        double min = nums[startRow][startCol];

        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                if (nums[r][c] < min) {
                    min = nums[r][c];
                }
            }
        }
        return min;
    }

    //2
    public static String[][] twoCharsTo2D(String[][] table, String[] words) {

        int index = 0;

        for (int r = 0; r < table.length; r++) {
            for (int c = 0; c < table[0].length; c++) {
                if (index > words.length - 1) {
                    table[r][c] = "$$";
                } else {
                    table[r][c] = words[index].substring(0, 2);
                    index++;
                }
            }
        }
        return table;
    }

    //3a
    public static double findAverage(int[] nums) {
        double total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total / nums.length;
    }

    //3b
    public static double[] rowAvg(int[][] nums) {
        double[] avg = new double[nums.length];

        for (int r = 0; r < nums.length; r++) {
            avg[r] = findAverage(nums[r]);
        }
        return avg;
    }

    //3c
    public static String bestAverage(String[] roster, int[][] grades) {

        double[] gpa = rowAvg(grades);
        double max = gpa[0];
        int maxIndex = 0;
        for (int i = 0; i < gpa.length; i++) {
            if (gpa[i] > max) {
                max = gpa[i];
                maxIndex = i;
            }
        }
        return roster[maxIndex];
    }

    //4a
    public static int[][] removeRow(int[][] mat, int row) {
        int[][] result = new int[mat.length - 1][mat[0].length];

        for (int r = 0; r < mat.length - 1; r++) {
            for (int c = 0; c < mat[r].length; c++) {
                if (r >= row) {
                    result[r][c] = mat[r + 1][c];
                } else {
                    result[r][c] = mat[r][c];
                }
            }
        }
        return result;
    }

    //4b
    public static int[][] removeCol(int[][] mat, int col) {
        int[][] result = new int[mat.length][mat[0].length - 1];

        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[r].length - 1; c++) {
                if (c >= col) {
                    result[r][c] = mat[r][c + 1];
                } else {
                    result[r][c] = mat[r][c];
                }
            }
        }
        return result;
    }

    //4c
    public static int[][] removeRowCol(int[][] mat, int row, int col) {
        return removeCol(removeRow(mat, row), col);
    }

    //5a
    public static boolean toBeChanged(int r, int c, String[][] grid) {

        if (grid[r][c].compareTo("O") != 0) {
            return false;
        }
        if (r == 0) {
            return true;
        }
        if (c == 0) {
            return true;
        }
        if (grid[r - 1][c].compareTo("O") == 0 && grid[r][c - 1].compareTo("O") == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    //5b
    public static String[][] change2DArray(String[][] grid){
        String [][] result = new String[grid.length][grid[0].length];
        
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                if (toBeChanged(r, c, grid)){
                    result[r][c] = "#";
                }
                else{
                    result[r][c] = grid[r][c];
                }
            }
        }
        return result;
    }
    
    //6
    public static char[][] soDramatic(char[][] lets){
        //modify the array
        for (int r = 0; r < lets.length; r++){
            for (int c = 0; c < lets[r].length; c++){
                if (lets[r][c] == 'a'){
                    lets[r][c] = Character.toUpperCase(lets[r][c]);
                }
                else if (lets[r][c] == 'h'){
                    lets[r][c] = Character.toUpperCase(lets[r][c]);
                }
                else if (lets[r][c] == 'j'){
                    lets[r][c] = Character.toUpperCase(lets[r][c]);
                }
                else if (lets[r][c] == 'r'){
                    lets[r][c] = Character.toUpperCase(lets[r][c]);
                }
                else {
                    lets[r][c] = '-';
                }
            }
        }
        return lets;
    }
    
    //7 (haha)
    public static int[][] reverseColMajor(int[][] mat){
        //return a new array with the countr starting from end that works its way up
        int cols = mat[0].length;
        int rows = mat.length;
        int[][] result = new int[rows][cols];
        int r = 0;
        int c = 0;
        
        for (int row = rows - 1; row >= 0; row--){
            for (int col = cols - 1; col >= 0; col--){
                result[r][c] = mat[row][col];
                c++;
                if (c == cols){
                    c = 0;
                    r++;
                }
            }
        }
        return result;
    }
}
