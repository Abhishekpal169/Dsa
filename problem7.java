import java.util.Arrays;

public class problem7 {
     public static void main(String[] args){
        
      	int a[] = { 10, 20, 15, 22, 35 };

        
        Arrays.sort(a);

        int x = 22;
        
      	int res = Arrays.binarySearch(a, x);
        
         System.out.println("Element to be searched is : "+ x);
         
        if (res >= 0)
            System.out.println(x + " found at index = " + res);
        else
            System.out.println(x + " Not found");

        x = 40;
        res = Arrays.binarySearch(a, x);
        
      	System.out.println("Element to  searched is : "+ x);
        if (res >= 0)
            System.out.println(x + " found at index = " + res);
        else
            System.out.println(x + " Not found");
    }
}
