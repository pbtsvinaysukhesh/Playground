#include <iostream>
using namespace std;

struct student
{
    char name[50];
    int roll;
    float marks;
};

int main() 
{
    student s;
    cout <<"\n"<< "Student Details " <<"\n";
    cin.get(s.name,40);
    cout << "Name: "<<s.name<<"\n";
    cin >> s.roll;
     cout << "Roll: "<<s.roll<<"\n";
    cin >> s.marks;
cout << "Marks: "<<s.marks<<"\n";
    return 0;
}
