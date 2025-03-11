#include <iostream>
#include <vector>
using namespace std;


//pair sum

// vector<int> pairsum(vector<int> nums,int target){
//     vector<int> ans;
//     int n=nums.size();
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             if(nums[i]+nums[j] == target){
//                 ans.push_back(i);
//                 ans.push_back(j);
//                 return ans; 
//             }
//         }
//     }
//     return ans;
// }




// vector<int> pairsum(vector<int> nums,int target){
//     vector<int> ans;
//     int n=nums.size();

// int i=0,j=n-1;
// while(i<j){
//     int pairsum=nums[i]+nums[j]; 

//     if(pairsum>target){
//     j--;
// }
// else if(pairsum<target){
//     i++;
// }
// else{
//     ans.push_back(i);
//     ans.push_back(j);
//     return ans;
// }

// }
// return ans;
// }






// int majorityelement(vector<int>& nums){
    
// int n=nums.size();

//     for (int val:nums)
//     {
//         int freq=0;
//         for (int el:nums)
//         {
//             if (el==val)
//             {
//                 freq++;
//             }
            
//         }
// if (freq>n/2)
// {
//     return val;
// }

//     }
//     return -1;
    
// }






// int majorityelement(vector<int>& nums){
    
// int n=nums.size();
//   sort(nums.begin() , nums.end());

// int freq= 1,ans=nums[0];
// for(int i=0;i<n;i++){
//     if(nums[i]==nums[i-1]){
//         freq++;
//     }
//     else{
//         freq=1;
//         ans=nums[i];
//     }
//     if(freq>n/2){
//         return ans;
//     }

// }
// return ans;
// }






 int majorityelement(vector<int>& nums){
    int freq=0,ans=0;

    for (int  i = 0; i<nums.size(); i++)
    {
        if (freq==0)
        {
            ans=nums[i];
        }
        if (ans==nums[i])
        {
           freq++;
        }
        else{
            freq--;
        }
        
    }

    int count=0;
    for (int val:nums)
    {
        if (val==ans)
        {
            count++;
        }
        
    }
    int n;
    if (count> n/2) {
        ans;
    }
    else{-1;}
    return ans;
 }

int main(){

// pair sum


    // vector<int> nums={2,7,11,15};
    // int target=13;
    // vector<int> ans = pairsum(nums,target);
    // cout<<ans[0]<<", "<<ans[1]<<endl;





//   vector<int> nums={2,7,11,15};
//     int target=13;
//     vector<int> ans = pairsum(nums,target);
//     cout<<ans[0]<<", "<<ans[1]<<endl;





// vector<int> nums={1,2,2,1,1,1,2,2,2};

// majorityelement(nums);
// cout <<majorityelement(nums)<<endl;










// vector<int> nums={1,2,2,1,1,1,2,2,2};

// majorityelement(nums);
// cout <<majorityelement(nums)<<endl;







vector<int> nums={1,2,2,1,1,1,2,2,2};

majorityelement(nums);
cout <<majorityelement(nums)<<endl;





    return 0;
}