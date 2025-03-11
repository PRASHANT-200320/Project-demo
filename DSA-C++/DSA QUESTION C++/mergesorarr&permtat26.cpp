#include<iostream>
using namespace std;


    // void merge(vector<int>& A, int m, vector<int>& B, int n) {
    //     int idx=m+n-1,i=m-1,j=n-1;

    //     while(i>=0 && j>=0)
    //     {
    //         if(A[i]>=B[j]){
    //             A[idx]=A[i];
    //             idx--,i--;
    //         }
    //         else{
    //             A[idx]=B[j];
    //             idx--,j--;
    //         }
    //     }
    //     while(j>=0){
    //         A[idx]=B[j];
    //         idx--,j--;
    //     }
    // }




    
 void nextPermutation(vector<int>& A) {
        
//find the pivot
int pivot=-1,n=A.size();
for(int i=n-2;i>=0;i--){
    if(A[i]<A[i+1]){
        pivot=i;
        break;
    }
}

if(pivot==-1){
    reverse(A.begin(),A.end());   //in place changes
    return;
}

//2nd step:next larger element
for(int i=n-1;i>pivot;i--){
    if(A[i]>A[pivot]){
        swap(A[i],A[pivot]);
        break;
    }
}

//3rd step:reverse (piv+1 to n-1)

// reverse(A.begin()+pivot+1,A.end());

int i=pivot+1,j=n-1;
while(i<=j){
    swap(A[i++],A[j--]);
}
    }



int main(){
    
}