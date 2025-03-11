import java.util.*;


public class KNIGHTTOUR {


public static void printSolution(int sol[][],int N){

    for(int x=0;x<N;x++){
        for(int y=0;y<N;y++){
          System.out.print(sol[x][y]+" ");
        }
        System.out.println();
    }
}

public static boolean  solveKT(int N){

    int sol[][]=new int[N][N];

    for(int x=0;x<N;x++){
        for(int y=0;y<N;y++){
            sol[x][y]=-1;
        }
    }

    int xMove[]={2,1,-1,-2,-2,-1,1,2};
     int yMove[]={1,2,2,1,-1,-2,-2,-1};

     sol[0][0]=0;

     if(!solveKTutil(0,0,1,sol,xMove,yMove,N)){
        System.out.print("solution does not exist");
        return false;
     }

     else{
        printSolution(sol,N);
     }
     return true;

}


public static boolean isSafe(int x,int y,int sol[][],int N){

    return (x>=0 && y>=0 && y<N && x<N &&  sol[x][y]==-1);
}


public static boolean solveKTutil(int x,int y,int move,int sol[][],int xMove[],int yMove[],int N){


int k,next_x,next_y;
if(move==N*N){
    return true;
}


for(k=0;k<8;k++){

   next_x =x+xMove[k];
   next_y =y+yMove[k];

 if(isSafe(next_x,next_y,sol,N)){
    sol[next_x][next_y]=move;
    if(solveKTutil(next_x,next_y,move+1,sol,xMove,yMove,N)){
        return true;
    }
  else{
    sol[next_x][next_y]= -1;
  }
 }
}
return false;

}
public static void main(String args[]){

  int N=8;
solveKT(N);
    
}

}