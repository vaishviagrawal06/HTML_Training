/*Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
 perimeter. Create objects with different values and call those methods*/

 #include<iostream>
 using namespace std;

 class Rectangle
 {
    public:
    float length;
    float breadth;

    float area(){
        return length*breadth;
    }
    float perimeter(){
        return 2*(length+breadth);
    }
 };

 int main(){
    Rectangle r1;
    r1.length=4;
    r1.breadth = 5;

    Rectangle r2;
    r2.length=6;
    r2.breadth = 8;

    Rectangle r3;
    r3.length=5;
    r3.breadth = 8;

    cout<< " Rectangle 1 :"<<endl;
    cout<< "area of Rectangle r1 is : "<< r1.area()<<endl;
    cout<< "perimeter of Rectangle r1 is : "<< r1.perimeter()<<endl;

     cout<< " Rectangle 2 :"<<endl;
    cout<< "area of Rectangle r2 is : "<< r2.area()<<endl;
    cout<< "perimeter of Rectangle r2 is : "<< r2.perimeter()<<endl;

     cout<< " Rectangle 3 :"<<endl;
    cout<< "area of Rectangle r3 is : "<< r3.area()<<endl;
    cout<< "perimeter of Rectangle r3 is : "<< r3.perimeter()<<endl;

   return 0;

 }