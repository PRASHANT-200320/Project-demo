#include<iostream>
#include<vector>
using namespace std;

bool ispossible(vector<int> &arr,int n,int m,int maxAllowedTime){
    int painters=1,time=0;
    for(int i=0;i<n;i++){
        if(time+arr[i]<=maxAllowedTime){
            time+=arr[i];
        }
        else{
            painters++;
            time=arr[i];
        }
    }
    return painters<=m;
}

int minTimeTopaint(vector<int> &arr,int n,int m){
    int sum=0,maxval=INT8_MIN;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        maxval=max(maxval,arr[i]);
    }
    int st=maxval,end=sum,ans=-1;

    while (st<=end)
    {
        int mid=st+(end-st)/2;

        if(ispossible(arr,n,m,mid)){//left
            ans=mid;
            end=mid-1;
        }
        else{//right
            st=mid+1;
        }
    }
    return ans;
    
}