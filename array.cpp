#include<iostream>
using namespace std;

int main(){

    int arr[] = {3,2,1,5,6};
    int large = arr[0];
    for(int i=0;i<6;i++){
        if (arr[i]>large){
                 large = arr[i];
        }
    }
    cout<<large;
    return 0;
}