#include<iostream>
using namespace std;

void f(int a[], int l, int r) {
    if (l >= r) return;
    swap(a[l], a[r]);
    f(a, l + 1, r - 1);
}

int main() {
    int n = 6;
    int a[6] = {19, 10, 8, 17, 9, 15};

    cout << "Original array: ";
    
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    cout << endl;

    f(a, 0, n - 1);

    cout << "Reversed array: ";
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    cout << endl;

    return 0;
}