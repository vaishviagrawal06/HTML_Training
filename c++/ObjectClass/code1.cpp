/*Create a class Student with fields name, rollNumber, and marks. Write a method to display
 student details. Create 3 student objects and display their data.*/

#include<iostream>
using namespace std;

class Student{
    public:

    string name;
    int rollNumber;
    int marks;

    void display(){
        cout<<"enter name :"<<name<<endl;
        cout<<"enter rollNumber :"<<rollNumber <<endl;
        cout<<"enter marks :"<<marks<<endl;
        cout <<"----------------------"<<endl;
    }
};

int main(){
    Student s1,s2,s3;

    s1.name="aman";
    s1.rollNumber=45;
    s1.marks=78;

    s2.name = "arjun";
    s2.rollNumber=67;
    s2.marks=89;

    s3.name="karan";
    s3.rollNumber=78;
    s3.marks=93;

    s1.display();
    s2.display();
    s3.display();

    return 0;
}
