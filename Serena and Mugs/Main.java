#include<iostream>
using namespace std;
int main()
{
  int n,c,sum=0;
cin>>n>>c;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+arr[i];
  }
  if(sum<=c)

 {

   std::cout<<"YES";

 }

 else

 {

   std::cout<<"NO";

 }
}