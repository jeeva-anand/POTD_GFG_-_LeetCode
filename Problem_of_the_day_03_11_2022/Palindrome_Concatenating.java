package Problem_of_the_day_03_11_2022;

import java.util.HashMap;
import java.util.Map;

public class Palindrome_Concatenating {
    public static int longestPalindrome(String[] words) {
        
        Map<String,Integer> map = new HashMap<>();
        int maxCount = 0;
        for(String s : words) {
            String word = ""+s.charAt(1)+s.charAt(0);
            if(map.containsKey(word)){
                maxCount += 4;
                map.put(word,map.get(word)-1);
                if(map.get(word) == 0)
                    map.remove(word);
            }else{
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        for(int i=0;i<26;i++){
            char c1 = (char) ('a'+i);
            char c2 = (char) ('a'+i);
            String str = ""+c1+c2;
            if(map.containsKey(str)){
                maxCount += 2;
                break;
            }
        }
        return maxCount;

    }
    public static void main(String[] args) {
        String arr[] = {"qo","fo","fq","qf","fo","ff","qq","qf","of","of","oo","of","of","qf","qf","of"};
        System.out.println(longestPalindrome(arr));
    }   
}
