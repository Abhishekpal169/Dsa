import java.util.*;
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        num = Math.abs(num);
        if(num == 0){
            System.out.println("No Factors :");
            return;
        }
        for(int i =1;i<=num;i++){
            if(num%i == 0){
                System.out.print(i);
                if(i != num){
                    System.out.print(",");
                }
            }
        }
    }
}
