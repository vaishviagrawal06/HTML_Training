package lect1;
//even odd

import java.util.Scanner;

class hello{
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
  
    System.out.print("enter no. :-");   // no. enter
    int n = sc.nextInt();

    if(n>0 && n%2==0){
        System.out.println("no.is even");   // even no.
    }
    else if(n>0 && n!=0){
        System.out.println("no. is Odd ");    // odd no.
    }
    else{
        System.out.println("invalid no. entered");   // invalid no. 
    }

    }
}