#include<iostream>
using namespace std;
struct employee
{
  char name[20];
  int id;
  int age;
  char designation[20];
  int salary;
};
int main()
{
  employee e;
  cin>>e.name;
  cin>>e.id;
  cin>>e.age;
  cin>>e.designation;
  cin>>e.salary;
  cout<<"Enter name:"<<"\nEnter ID: "<<"\nEnter age:"<<"\nEnter designation:"<<"\nEnter Salary:";
  cout<<"\nEmployee Details"<<endl;
  cout<<"Name of the Employee : "<<e.name<<endl;
  cout<<"ID of the Employee : "<<e.id<<endl;
  cout<<"Age of the Employee : "<<e.age<<endl;
  cout<<"Designation of the Employee : "<<e.designation<<endl;
  cout<<"Salary of the Employee : "<<e.salary<<endl;
}
  