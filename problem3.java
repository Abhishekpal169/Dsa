import java.util.*;
public class problem3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter a number first :");
     int a = sc.nextInt();
     System.out.println("Enter a number  second :");   
     int b = sc.nextInt();
     int result = (a*a*a)+(3*a*a*b)+(3*a*b*b)+(b*b*b);
     System.out.println("Sum of result :"+result);
    }
}
