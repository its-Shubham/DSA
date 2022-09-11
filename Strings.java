
public class Strings {
    // palindrome
    public static boolean palindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // to get shortest distance in form of NSEW
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            // North
            if (path.charAt(i) == 'N') {
                y++;
            }
            // South
            else if (path.charAt(i) == 'S') {
                y--;
            }
            // East
            else if (path.charAt(i) == 'E') {
                x++;
            }
            // West
            else if (path.charAt(i) == 'W') {
                x--;
            }
        }
        float x2 = x * x, y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    // return subString
    public static String subString(String str, int start, int end) {
        String subString = "";
        for (int i = start; i < end; i++) {
            subString += str.charAt(i);
        }
        return subString;
    }

    // largest lexicographical string
    public static String largestStringLexicographically(String fruits[]) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        return largest;
    }

    // to upper case -> capatilize first alphabet of every word in a sentence -> using StringBuilder
    //T.C-> O(n) -> length of string
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i =1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // for palindrome
        // String str = "racecar";
        // System.out.println(palindrome(str));
        
        // for shortest path
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));
        
        // for substring
        // String str = "shubham";
        // System.out.println(str.substring(0, 5));
        // System.out.println(subString(str, 0, 5));
        
        // for largest String Lexicographically
        // String fruits[] = { "apple", "mango", "banana" };
        // System.out.println(largestStringLexicographically(fruits));

        // StringBuilder sb = new StringBuilder("");
        // for(char ch ='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // uppercase of every word in a sentence
        String str="hi, i am shubham ";
        System.out.println(toUpperCase(str));
    }
}
