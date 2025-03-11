#include <iostream>
#include<vector>
using namespace std;


// // void changeA(int *ptr)   //pass by referance using pointer
// void changeA(int &b)         //pass by referance using alias
// {
//     // a=20;
//     // *ptr=20;

// b=20;
// }






int main()
{

//     int a=10;

//     int*ptr=&a;
//     cout<< ptr <<endl;
    
//     cout<< &a <<endl;
    
//     cout<< &ptr<<endl;

// int**parptr=&ptr;

//     cout<< &ptr<<endl;
//      cout<< parptr <<endl;

//     cout<<  &a <<endl;

//     cout<< *(&a)<<endl;
//     cout<<*(ptr)<<endl;
//     cout<<*(parptr)<<endl;
//     cout<<**(parptr)<<endl;



    // int**ptr=NULL;
    // cout<<ptr<<endl; 





    // QESTION 1



    // int a=5;
    // int *p=&a;
    // int **q=&p;

    // cout<< *p <<endl;
    // cout<<**q<<endl;
    // cout<<p<<endl;
    // cout<<*q<<endl;




// // pass by referance


// int a=10;
// // changeA(&a);
// changeA(a);
// cout<<"inside main fnx: "<<a<<endl;




//  //Array pointer



// int arr[]={1,2,3,4,5};

//  // cout<<arr<<endl;      
// // cout<<*arr<<endl;    ///pointer=>1
// // cout<<  *(arr+1)  <<endl;
// // cout<<  *(arr+2)  <<endl;
// // cout<<  *(arr+3)  <<endl;

// // int*ptr2;    //100
// // int*ptr1=ptr2+2;    //108
// // cout<< ptr1-ptr2<<endl;    //2  byts

// int*ptr1;
// // int*ptr2;
// int*ptr2=ptr1;
// cout<<ptr1<<endl;
// cout<<ptr2<<endl;
// // cout<< (ptr1<ptr2) <<endl;
// cout<< (ptr1==ptr2) <<endl;





// //pointer Arithmetic

// int arr[]={1,2,3,4,5};
// int a=10;
// int*ptr=&a;
// cout<<ptr<<endl;
// // ptr++;
// // ptr--;
// ptr=ptr+2;          //2int =>8byts
// cout<<ptr<<endl;   //+4 




//  Q 2



int arr[]={10,20,30,40};
int*ptr=arr;

cout<< *(ptr+1) <<endl;
cout<< *(ptr+3) <<endl;
ptr++;
cout<< *ptr <<endl;

    return 0;

}