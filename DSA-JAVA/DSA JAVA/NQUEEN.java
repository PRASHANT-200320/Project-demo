
import java.util.*;

public class NQUEEN {






public static void nqueen(char board[][],int row){
    if(row==board.length){
        printboard(board);
        return;

    }

    for(int j=0;j<board.length;j++){
        if(isSafe(board,row,j)){
            board[row][j]='Q';
            nqueen(board,row+1);
            board[row][j]='x';
        }
    }
}

public static boolean isSafe(char board[][],int row,int col){

    //vertical

    for(int i=row-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
    }

    //left dig

    for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
        return false;
        }
    }

    //right dig
   
    for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++){
        if(board[i][j]=='Q'){
        return false;
    }
   }
    return true;
}

public static void printboard(char board[][]){
    System.out.println("-----chess-----");
   
    for(int i=0;i<board.length;i++){

    for(int j=0;j<board.length;j++){

        System.out.print(board[i][j]+" ");
    }
     System.out.println();
    }
   
}

public static void main(String args[]){
    int n=4;
    char board[][]=new char[n][n];
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
            board[i][j]='x';
    }
    }
    nqueen(board,0);
}



//count


// public static void nqueen(char board[][],int row){
//     if(row==board.length){
//       count++;
//         return;

//     }

//     for(int j=0;j<board.length;j++){
//         if(isSafe(board,row,j)){
//             board[row][j]='Q';
//             nqueen(board,row+1);
//             board[row][j]='x';
//         }
//     }
// }

// public static boolean isSafe(char board[][],int row,int col){

//     //vertical

//     for(int i=row-1;i>=0;i--){
//         if(board[i][col]=='Q'){
//             return false;
//         }
//     }

//     //left dig

//     for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
//         if(board[i][j]=='Q'){
//         return false;
//         }
//     }

//     //right dig
   
//     for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++){
//         if(board[i][j]=='Q'){
//         return false;
//     }
//    }
//     return true;
// }

// public static void printboard(char board[][]){
//     System.out.println("-----chess-----");
   
//     for(int i=0;i<board.length;i++){

//     for(int j=0;j<board.length;j++){

//         System.out.print(board[i][j]+" ");
//     }
//      System.out.println();
//     }
   
// }


// static int count=0;

// public static void main(String args[]){
//     int n=4;
 
//     char board[][]=new char[n][n];
//     for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//             board[i][j]='x';
//     }
//     }
//     nqueen(board,0);
//     System.out.println("total ways:"+count);
// }




//one solution



// public static boolean nqueen(char board[][],int row){
//     if(row==board.length){
//       count++;
//         return true;

//     }

//     for(int j=0;j<board.length;j++){
//         if(isSafe(board,row,j)){
//             board[row][j]='Q';
//            if(nqueen(board,row+1)){
//             return true;
//            }
//             board[row][j]='x';
//         }
//     }
//     return false;
// }

// public static boolean isSafe(char board[][],int row,int col){

//     //vertical

//     for(int i=row-1;i>=0;i--){
//         if(board[i][col]=='Q'){
//             return false;
//         }
//     }

//     //left dig

//     for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--){
//         if(board[i][j]=='Q'){
//         return false;
//         }
//     }

//     //right dig
   
//     for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++){
//         if(board[i][j]=='Q'){
//         return false;
//     }
//    }
//     return true;
// }

// public static void printboard(char board[][]){
//     System.out.println("-----chess-----");
   
//     for(int i=0;i<board.length;i++){

//     for(int j=0;j<board.length;j++){

//         System.out.print(board[i][j]+" ");
//     }
//      System.out.println();
//     }
   
// }


// static int count=0;

// public static void main(String args[]){
//     int n=4;
 
//     char board[][]=new char[n][n];
//     for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//             board[i][j]='x';
//     }
//     }
//    if(nqueen(board,0)){
//     System.out.println("solution is poosible");
//     printboard(board);
//    }
//    else{
//     System.out.println("solution is not possible");
//    }
//     System.out.println("total ways:"+count);
// }


}