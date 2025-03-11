import java.util.*;
public class solution {

    // public static int trapp(int height[]){
    //      int n=height.length;
    //     int leftmax[] = new int[n];
    //  leftmax[0] = height[0];
    //     for(int i=1;i<n;i++){
    //    leftmax[i] = Math.max(leftmax[i-1],height[i]);
    //     }
    //     int rightmax[] = new int[n];
    //     rightmax[n-1] = height[n-1];
    //     for(int i=n-2;i>=0;i--){
    //    rightmax[i] = Math.max(rightmax[i+1],height[i]);
    //     }
     
    //   int trappwater=0;
    //   for(int i=0; i<n;i++){
    //    int waterlevel =Math.min(leftmax[i],rightmax[i]);
    //     trappwater +=waterlevel-height[i];
    //   }
    //   return trappwater;

    // }



question 5 not solve




    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);

       int height[] = {4,2,0,3,2,5};
      
System.out.print(trapp(height));

    }
}

















      
    //   for(int i=1;i<=n;i++) {

    //     for(int j=1;j<=i;j++){
    //           System.out.print("*");
    //     }
    //     for(int j=1;j<=2*(n-i);j++) {
    //           System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //            System.out.print("*");
    //     }
    //        System.out.println();
    //   }
    //      for(int i=n;i>=1;i--){
    //          for(int j=1;j<=i;j++)
    //           System.out.print("*");
    //      }
    //      for(int j=1;j<=2*(n-i);j++) {
    //           System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //            System.out.print("*");
    //     }
    //      System.out.println();




    










































