public class problem15 {
public static String moveHash(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "Move#Hash#to#Front";
        String output = moveHash(input);

        System.out.println(output);
    }
}

