public class problem14 {
    public static void main(String[]args){
        int arr[] = {2,1,3,4,5,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if((arr[i] == arr[j]) && (i != j)){
                    System.out.println("Duplicte Element :"+arr[j]);
                }
            }
        }
    }
}
