import java.util.Arrays;

public class anagram {
    static void isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1, ch2);

            if (result) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
        } else {
            System.out.println("Not Anagram");
        }
    }
        
        

    public static void main(String args[]) {
        isAnagram("Alok", "okla");
        isAnagram("heera", "heera");
        isAnagram("Race", "Care");
    }
}
