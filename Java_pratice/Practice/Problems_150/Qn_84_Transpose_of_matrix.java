package Practice.Problems_150;/*
Given a 2D integer array matrix, return the transpose of the matrix.
    Explanation:
    The transpose of a matrix is the matrix flipped over its main diagonal, switching
    the matrix's row and column indices.
    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[1,4,7],[2,5,8],[3,6,9]]
*/
import java.util.*;

public class Qn_84_Transpose_of_matrix {
    public static void main(String[] args) {
        int nums[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(transpose(nums)));
    }

    public static int[][] transpose(int nums[][]) {
        int rows = nums.length;
        int cols = nums[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                int temp = nums[j][i];
                nums[j][i] = nums[i][j];
                nums[i][j] = temp;
            }
        }
        return nums;
    }
}
	/*
	    int rows = nums.length;
        int cols = nums[0].length;
        int res[][] = new int[cols][rows];
        for(int  i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                res[j][i] = nums[i][j];
            }
        }
        return res;
	*/
