

import java.util.*;

public class SUDOKUSOLVER {

public static boolean isSafe(int sudoku[][],int row,int col,int digit){

    //column

    for(int i=0;i<=8;i++){
        if(sudoku[i][col]==digit){
        return false;
    }
    }

    //row

    
    for(int j=0;j<=8;j++){
       if(sudoku[row][j]==digit){
        return false;
    }
    }
    //grid

  int sr=(row/3)*3;
  int sc=(col/3)*3;

   for(int i=sr;i<sr+3;i++){
     for(int j=sc;j<sc+3;j++)  
          if(sudoku[i][j]==digit){
           return false;
          }
       }
    }
}


public static boolean sudokusolver(int sudoku[][],int row,int col){
    //base
    if(row == 9 && col == 0){
        return true;
    }

    //recursion

    nextrow = row;
    nextcol+=1;
    if(col+1==9){
    nextrow = row+1;
    nextcol=0;
}

  if(sudoku[row][col]!=0){
    return sudokusolver(sudoku,nextrow,nextcol)
  }
   for(int digit =1;digit<=9;digit++){

    if(isSafe(sudoku,row,col,digit)){
        sudoku[row][col]=digit;
        if(sudokusolver(sudoku,nextrow,nextcol)){
            return true;
        }
        sudoku[row][col]==0;
    }
    return false;
   }
  
}

public static int printsudoku(int sudoku[][]){
    for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
        System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
}





