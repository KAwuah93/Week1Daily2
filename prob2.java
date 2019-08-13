public class prob2 {
    public static void main(String[] args) {

        String x = "banana";
        String y = "racecar";

        System.out.println(" Is " + x + " a palindrome? " + palindromeCheck(x));
        System.out.println(" Is " + y + " a palindrome? " + palindromeCheck(y));
    }

    public static boolean palindromeCheck(String x) {
        boolean ispalin = true;

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == x.charAt(x.length() - (1 + i))) {
                continue;
            } else {
                return false;

            }
        }

        return ispalin;
    }

}