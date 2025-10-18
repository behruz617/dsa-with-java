package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagramByFor("career", "reerac"));
        System.out.println(isAnagramByFor("alma", "alme"));
        System.out.println(isAnagramByHashMap("career", "reerac"));
        System.out.println(isAnagramByHashMap("alma", "alme"));
    }

    //Birinci yol sort usulu ile timeComplexity O(nLog n) space complexity O(1)
    public static boolean isAnagramByFor(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);


    }

    //Ikinci yol hashMap usulu ile
    public static boolean isAnagramByHashMap(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();

        //s deki herfleri sayiriq
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        //t deki  herfleri azaldirig
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) return false;
        }
        return true;
    }


}
