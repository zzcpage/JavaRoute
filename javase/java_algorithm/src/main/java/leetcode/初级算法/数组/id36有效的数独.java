package leetcode.初级算法.数组;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author : zzc
 * @date: 2021-10-26 09:59
 **/
public class id36有效的数独 {
    //    题目描述
    //    请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
    //
    //    数字 1-9 在每一行只能出现一次。
    //    数字 1-9 在每一列只能出现一次。
    //    数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
    //    数独部分空格内已填入了数字，空白格用 '.' 表示。
    //
    //    注意：
    //
    //    一个有效的数独（部分已被填充）不一定是可解的。
    //    只需要根据以上规则，验证已经填入的数字是否有效即可。

    //    解法1
    //    最简单的方法就是，逐个条件进行验证，按行，按列，按分块进行验证。
    //    进一步优化，一步解决，通过计算分块位置，一次解决。分块位置通过 idx = i/3 *3 + j/3 进行计算
    public boolean isValidSudoku(char[][] board) {
        int i = 0 , j = 0 , k = 0 , l = 0 ;  ;
        HashMap<Integer, HashSet<Integer>> area = new HashMap<Integer, HashSet<Integer>>() ;
        //判断行列是否符合数独条件
        for(i = 0 ; i < board.length ; i++){
            HashMap<Character, Integer> row = new HashMap<Character, Integer>() ;
            HashMap<Character, Integer> col = new HashMap<Character, Integer>() ;
            for(j = 0 ; j < board.length ; j++){
                if(board[i][j] != '.'){
                    if(row.containsKey(board[i][j])){
                        return false;
                    }else{
                        row.put(board[i][j],1) ;
                    }
                }
                if(board[j][i] != '.'){
                    if(col.containsKey(board[j][i])){
                        return false;
                    }else{
                        col.put(board[j][i],1) ;
                    }
                }
            }
        }

        //判断3x3小矩阵是否符合条件
        for(i = 0 ; i < board.length ; i+=3){
            for(j = 0 ; j < board.length ; j+=3){
               HashMap<Character, Integer> row = new HashMap<Character, Integer>() ;
               for(k = 0 ; k < 3; k++){
                   for(l = 0 ; l < 3 ; l++){
                       if(board[i+k][j+l] != '.'){
                           if(row.containsKey(board[i+k][j+l] )){
                               return false;
                           }else{
                               row.put(board[i+k][j+l] ,1) ;
                           }
                       }
                   }
               }
            }
        }

        return true  ;
    }

    //    解法2:
    //    进一步优化，一步解决，通过计算分块位置，一次解决。分块位置通过 idx = i/3 *3 + j/3 进行计算
    public boolean isValidSudokuTwo(char[][] board) {
        int i = 0 , j = 0 , k = 0 , l = 0 , idx  ;
        HashMap<Integer, HashSet<Character>> area = new HashMap<Integer, HashSet<Character>>() ;
        //判断行列是否符合数独条件
        for(i = 0 ; i < board.length ; i++){
            HashMap<Character, Integer> row = new HashMap<Character, Integer>() ;
            HashMap<Character, Integer> col = new HashMap<Character, Integer>() ;
            for(j = 0 ; j < board.length ; j++){
                if(board[i][j] != '.'){
                    if(row.containsKey(board[i][j])){
                        return false;
                    }else{
                        row.put(board[i][j],1) ;
                    }
                }
                if(board[j][i] != '.'){
                    if(col.containsKey(board[j][i])){
                        return false;
                    }else{
                        col.put(board[j][i],1) ;
                    }
                }
                idx = (i/3)*3 + j/3 ;
                if(!area.containsKey(idx)){
                    area.put(idx,new HashSet<Character>()) ;
                }
                if(area.get(idx).contains(board[i][j])){
                    return false;
                }else{
                    area.get(idx).add(board[i][j]) ;
                }
            }
        }
        return true  ;
    }

    public static void main(String[] args) {

    }

}
