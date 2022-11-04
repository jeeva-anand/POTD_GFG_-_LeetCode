package Problem_of_the_day_04_11_2022;

public class Reverse_Vowels_of_a_String {
    public static String reverseVowels(String str) {
        String s = "aeiouAEIOU";
        int j = str.length() - 1;
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < str.length();i++ ) {
            while (i < str.length() && s.indexOf(str.charAt(i)) == -1) {
                i++;
            }
           
            while (j >= 0 && s.indexOf(str.charAt(j)) == -1) {
                char curr = str.charAt(j);
                j--;
            }
            if (i < j) {
                char c = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, c);               
                j--;
              
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Live on evasions? No, I save no evil."));
    }
}
