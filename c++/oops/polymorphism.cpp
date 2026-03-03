#include<iostream>
using namespace std;

class area
{
    public:
    int calculateArea(int r){
        return 3.14 * r* r;
    }

    int calculateArea(int l, int b){
        return l* b;
    }
};
int main()
{
    area a;

    cout << "Area of Circle: " << a.calculateArea(5) << endl;
    cout << "Area of Rectangle: " << a.calculateArea(4, 6) << endl;

    return 0;
}