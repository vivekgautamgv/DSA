#include<iostream>
using namespace std;

void selection(int arr[],int n){
    for(int i =0;i<n-1;i++){ // changed from n-2 to n-1
        int mini = i; // initialize mini with i
        for(int j=i+1;j<=n-1;j++){ // start j from i+1
            if (arr[j]<arr[mini])
                mini = j;
        }

        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
    }
}


int main(){

    int n ;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[i];
    selection(arr,n);
    for(int i=0;i<n;i++) cout<<arr[i]<<" ";
    return 0;

}