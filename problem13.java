
public class problem13 {
    
    public static void main(String[] args) {
        int my_num;
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        my_num = 7;
       int expected_num = my_num * ((my_num + 1) / 2);

        int num_sum = 0;

        for (int i : numbers) {
            num_sum += i;
        }
        System.out.print( expected_num - num_sum);
        System.out.print("\n");
    }
}

