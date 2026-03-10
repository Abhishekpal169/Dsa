public class prime {
    public static void main(String[]args){
        int num = 23; 
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
        }
        for(int i=2;i<=num/2;i++){
            if(num %i == 0){
                isPrime = false;
            }

        }
        System.out.println(isPrime);
    }
}
