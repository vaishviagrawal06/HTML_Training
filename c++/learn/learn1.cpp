// if-else statements

// WAP that takes an input of age and print you are adult or not
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int age;
    cout << " enter age :" << endl;
    cin >> age;
    if (age >= 18)
    {
        cout << " you are an adult";
    }
    else if (age > 0 && age < 18)
    {
        cout << " you are a child ";
    }
    else
    {
        cout << " invalid age entered";
    }
    
    return 0;
}

/* output :-
     enter age :
     -6
     invalid age entered

     enter age :
     45
     you are an adult

     enter age :
     15
     you are a child */
