#include<iostream>
using namespace std;

void f(int sum, int n){ 
    if(n > 0){
        sum = sum + n;
        
        
    }
    f(sum, n-1);
    cout << sum << endl;
}

int main(){
    int n = 5;
    f(0, n);
    return 0;
}