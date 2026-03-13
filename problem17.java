
    public class problem17 {
    public static void main(String[] args) {
        String str = "aabbbbccccddddeeee";
        String result = "";
        
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result += str.charAt(i - 1) + "" + count;
                count = 1;
            }
        }
        result += str.charAt(str.length() - 1) + "" + count;
        System.out.println(result);
    }
}

