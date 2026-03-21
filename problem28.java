import java.util.Scanner;
public class problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int tax;
        if(num<500){
            tax =0;
        }else if(num<500 && num<1000){
            tax = (int)(num*2.0);
        }else{
            tax = (int)(num*3.0);
        }
        System.out.println("your tax is :"+tax);
    }
}


