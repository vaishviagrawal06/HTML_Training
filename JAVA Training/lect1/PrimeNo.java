// prime no.

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter value of n");
        n=sc.nextInt();

        boolean flag = true;
        for(int i =2;i<=n/2;i++){
            if(n%i ==0)
            {
              flag = false;
              break;
            }
        }

        if(flag){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}