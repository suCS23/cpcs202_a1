
import java.util.*;
public class Main {
 
    public static void main(String[] args) {
 
       Scanner input = new Scanner(System.in);
       int d = input.nextInt();
       int y = d / 365;
       int m = (d - (y*365)) / 30;
       int a = (d - (y*365) - (30*m));
       System.out.println(y + " ano(s)");
       System.out.println(m + " mes(es)");
       System.out.println(a + " dia(s)");
 
    }
 
}
