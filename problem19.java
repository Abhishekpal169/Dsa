
    public class problem19 {
    public static void main(String[] args) {
        String s = "abba";
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        if (s.equals(reversed)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

