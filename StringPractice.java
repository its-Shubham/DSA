
public class StringPractice {

    // question 1
    // lowercase vowel counter
    public static int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;

    }

    // question 4
    // check anagram -> my approach--> high time complexity -->linear time complexity approach is available in assignment solution
    public static boolean anagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < str1.length(); i++) {
                sum1 += (int) str1.charAt(i);
                sum2 += (int) str2.charAt(i);
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "study", str2 = "dusty";
        System.out.println(anagram(str1, str2));
    }
}
