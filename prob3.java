public class prob3 {
    public static void main(String[] args) {

        int x = 9;

        String result = fizzbuzz(x);

        System.out.println(result);

    }

    public static String fizzbuzz(int x) {
        String result = "";

        if (x % 3 == 0)
            result += "fizz";
        if (x % 5 == 0)
            result += "buzz";

        return result;

    }
}