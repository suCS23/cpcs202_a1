
import java.util.*;
public class Main {
 
    public static void main(String[] args) {
 
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       double h = input.nextDouble();
       double p = input.nextDouble();
       double s = h * p ;
       System.out.println("NUMBER = "+n);
       System.out.printf("SALARY = U$ %.2f",s);
       System.out.println();
       
       
 
    }
 
}
