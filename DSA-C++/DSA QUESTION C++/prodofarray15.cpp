// vector<int> producteexceptseif(vector<int>&nums){
// int n=nums.size();
// vector<int> ans(n,1);
// for(i=0;i<n;i++){

//     prod=1;

//     for(j=0;j<n;j++){
//         if(i!=j){
//             prod*=nums[j];
//         }
//     }
//     ans[i]=prod;
// }
// return ans;
// };



// vector<int> productExceptSelf(vector<int>& nums) {
//   int n=nums.size();
//   vector<int> ans(n,1);  
//   vector<int> prefix(n,1);  
//   vector<int> suffix(n,1);    


// //prefix
// for(int i=1;i<n;i++){
//     prefix[i]=prefix[i-1]*nums[i-1];
// }

// //suffix
// for(int i=n-2;i>=0;i--){
//     suffix[i]=suffix[i+1]*nums[i+1];
// }

// for(int i=0;i<n;i++){
//     ans[i]=prefix[i]*suffix[i];
// }
// return ans;

//     }





//  vector<int> productExceptSelf(vector<int>& nums) {
//   int n=nums.size();
//   vector<int> ans(n,1);   


// //prefix
// for(int i=1;i<n;i++){
//     ans[i]=ans[i-1]*nums[i-1];
// }

// //suffix
// int suffix=1;
// for(int i=n-2;i>=0;i--){
//     suffix*=nums[i+1];
//     ans[i]*=suffix;
// }

// return ans;

//     }