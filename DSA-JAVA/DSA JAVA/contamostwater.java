import java.util.*;

public class contamostwater{


// //TC =o(n2)

//    public static int storewater(ArrayList<Integer>height){

//     int maxwater =0;

//     for(int i=0;i<height.size();i++){
//          for(int j=i+1;j<height.size();j++){
//             int ht =Math.min(height.get(i),height.get(j));
//             int width =j-i;
//             int currwater =ht*width;
//             maxwater = Math.max(maxwater,currwater);
//          }
//     }
//     return maxwater;
//    }
 
//  public static void  main (String args[]){

//     ArrayList<Integer> height =new ArrayList<>();
//     height.add(1);
//      height.add(8);
//       height.add(6);
//        height.add(2);
//         height.add(5);
//          height.add(4);
//           height.add(8);
//            height.add(8);

//            System.out.print(storewater(height));
//  }
   


public static int storewater(ArrayList<Integer>height){

    int maxwater =0;

    int lp=0;
    int rp=height.size()-1;

    while(lp<rp){

      int ht =Math.min(height.get(lp),height.get(rp));
      int width =rp-lp;
      int currwater =ht*width;

      maxwater =Math.max(currwater,maxwater);
      if(height.get(lp)<height.get(rp)){
         lp++;
      }
      else{
         rp--;
      }
      
    }

    return maxwater;
}

 public static void  main (String args[]){

    ArrayList<Integer> height =new ArrayList<>();
    height.add(1);
     height.add(8);
      height.add(6);
       height.add(2);
        height.add(5);
         height.add(4);
          height.add(8);
           height.add(7);

           System.out.print(storewater(height));
 }
}















