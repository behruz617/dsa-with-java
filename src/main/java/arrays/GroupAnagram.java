package arrays;

import java.util.*;

public class GroupAnagram {
    String[] str = {"car", "cat", "act", "alo", "ola"};


    public static List<List<String>> GroupAnagramm(String[] str) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
            /*
            Yuxaridaki metodun acilisi  kohne qayda ile olsaydi onda bele olardi
            if(!map.containsKey(key){
                    map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
            yeni teze yazilan metod o dimeydirki eger bu acar mapda yoxdursa onda new Arraylsit yaradib icine qoy
            sonra hemin listi geri qaytar ve s sozunu ora elave et.
             */
        }
        return new ArrayList<>(map.values());
    }
}
