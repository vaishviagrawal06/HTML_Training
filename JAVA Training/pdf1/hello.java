package pdf1;
import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("ENTER SIZE OF ARRAY :");
       int n = sc.nextInt();
       int []arr = new int[n];
       int sum = 0;

       System.out.println("enter elements");
       for(int i = 0;i<n;i++){
          arr[i]=sc.nextInt();
          sum +=arr[i];
    }
    System.out.println("sum :"+sum);
    
}

}
