#include<iostream>
#include<vector>
using namespace std;


int maxsubarray(vector<int>& nums){
int currsum=0,  maxsum=INT8_MIN;
for(int i=0;i<nums.size();i++){
    currsum+=nums[i];
    maxsum=max(currsum,maxsum);

    if(currsum<0){
        currsum=0;
    }
}
return maxsum;
}






int main(){


// subarray sum

//     int n=5;
//     int arr[5]={1,2,3,4,5};
//     for(int st=0;st<n;st++){
//         for(int end=st;end<n;end++){
//             for(int i=st;i<=end;i++){
//                 cout<<arr[i];
//             }
//             cout<<" ";
//         }
//         cout<<endl;
// }


// max subarray sum


    // int n=5;
    // int arr[5]={1,2,3,4,5};
    // int maxsum=INT8_MIN;

    // for(int st=0;st<n;st++){
    //     int currsum=0;
    //     for(int end=st;end<n;end++){
    //         currsum+=arr[end];
    //             maxsum=max(currsum,maxsum);
    //         }
            
    //     }

    // cout<<"max subarray sum="<<maxsum<<endl;



// kadane algorithm

vector <int >nums ={3,-4,5,4,-1,7,-8};

// maxsubarray(nums);


    cout<<maxsubarray(nums)<<endl;




    return 0;
}
