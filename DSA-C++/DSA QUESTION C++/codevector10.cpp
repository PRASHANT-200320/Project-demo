#include <iostream>
#include <vector>
using namespace std;


// linear search


// int linearsearch( vector<int>& vec,int target){

//     for(int i=0;i<vec.size();i++){
//         if(vec[i] == target){
//             return i;
//         }
//     }
//     return -1;
// }



// reverse code in vector


void reversearray(vector<int>& vec){
    int start=0;
int end=vec.size()-1;
while(start < end){
    swap(vec[start],vec[end]);
    start++;
    end--;
}
}




int main() {
    // vector<int>vec={1,2,3};
    // vector<int>vec(5,0);
    // vector <char> vec = {'a','b','c','d','e'};
// vector <int> vec;

// cout <<"size="<< vec.size()<< endl;

// vec.push_back(25);
// vec.push_back(35);
// vec.push_back(45);

// cout<<"after push back size=" << vec.size()<<endl;
    // for(int i:vec)
    // for(char val: vec)
    // {//for each loop

    //     cout<< val <<endl;
    // }

//     vec.pop_back();
//  vec.pop_back();


// cout << vec.front() <<endl;

// cout << vec.back() <<endl;
// cout<<vec.at(2)<<endl;
    //  for(int val: vec)
    // {//for each loop

    //     cout<< val <<endl;
    // }

    // cout << vec[0]<<endl;
    // cout << vec[1]<<endl;
    // cout << vec[2]<<endl;
    // cout << vec[3]<<endl;
    // cout << vec[4]<<endl;




//   vec.push_back(0);
//   vec.push_back(1);
//   vec.push_back(2);
//   vec.push_back(3);
//   vec.push_back(4);

//    cout << vec.size() <<endl;
// cout << vec.capacity() <<endl;



// // linear search

// vector <int> vec = {1,2,3,4,5};
// int target=5;


// cout<< linearsearch(vec,target);
// // int index=linearsearch(vec,target);

// // if(index!=-1){
// //     cout<<index<<endl;
// // }
// // else{
// //     cout<<"not found"<<endl;
// // }




// reverse code in vector



vector <int> vec = {1,2,3,4,5};

 cout <<"orignal array=";

for(int i=0;i< vec.size(); i++){
    cout <<vec[i]<< " ";
}
cout <<endl;

reversearray(vec);

cout <<"reverse array="<<endl;

for(int i=0;i < vec.size();  i++){
     cout << vec[i] <<" ";
}
cout <<endl;

    return 0;
}