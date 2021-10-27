package leetcode.初级算法.数组;

/**
 * @author : zzc
 * @date: 2021-10-26 10:43
 **/
public class id48RoateImage {
    //    problem interduce
    //    You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    //
    //    You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
    //  通过辅助数组进行实现
    public void rotate(int[][] matrix) {
        int[][] totataMatrix = new int[matrix.length][matrix.length] ;
        int i = 0 , j = 0 , len = matrix.length;
        for(i = 0 ; i < len ; i++){
            for(j = 0 ; j < len ; j++){
                totataMatrix[j][len-i-1] = matrix[i][j];
            }
        }
        for(i = 0 ; i < len ; i++){
            for(j = 0 ; j < len ; j++){
                matrix[i][j] = totataMatrix[i][j];
            }
        }
    }

    // 如果需要原地旋转，那就必须需要考虑数组下标之间的关系，然后进行旋转操作
    public void rotateTwo(int[][] matrix) {
        int i = 0 , j = 0 , len = matrix.length;
        for(i = 0 ; i < len / 2; i++){
            for(j = 0 ; j < (len+1) /2 ; j++){
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[len-j-1][i] ;
                matrix[len-j-1][i] = matrix[len-i-1][len-j-1] ;
                matrix[len-i-1][len-j-1] = matrix[j][len-i-1] ;
                matrix[j][len-i-1] = temp ;
            }
        }
    }

    // 数组选择90度又可以转换为数组翻转问题，首先进行上下翻转，然后再根据主对角线进行翻转。

    public void rotateThree(int[][] matrix) {
        int i = 0 , j = 0 , len = matrix.length;
        //1. 先上下翻转

        //2. 然后在以主对角线翻转
    }

    public static void main(String args[]) {

    }
}
