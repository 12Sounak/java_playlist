#include<bits/stdc++.h>
using namespace std;
void change(int arr[])
{
    arr[0]  = 99;
}
int main()
{
    // int n = 4;
    int arr[4] = {2,3,4,5};
    int n = sizeof(arr)/sizeof(arr[0]);
    // print before modify
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
    change(arr);
    // print after modify
    cout<<"\n";
    for(int i=0;i<n;i++)
    {
        cout<<arr[i]<<" ";
    }
}
