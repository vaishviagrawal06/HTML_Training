//Find Largest of Two Numbers

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        // int a = 25;
        // int b = 35;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();

        System.out.println("enter value of b");
        int b = sc.nextInt();


        if(a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
    }
}