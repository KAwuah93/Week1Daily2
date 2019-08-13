import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

public class prob4 {
    public static void main(String[] args) {

        Boolean test = Anagrams("listen", "silent");
        System.out.println(test);

    }

    public static Boolean Anagrams(String wrd1, String wrd2) {
        Boolean isAnagram = false;

        if (wrd1.length() != wrd2.length())
            return isAnagram;

        char[] arr1 = wrd1.toCharArray();
        char[] arr2 = wrd2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // System.out.println(arr1);
        // System.out.println(arr1);

        // go through and map out the key, value pairs
        for (int i = 0; i < wrd1.length(); i++) {
            if (arr1[i] != arr2[i])
                break;
        }

        return true;

    }
}