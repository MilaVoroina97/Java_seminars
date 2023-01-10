package seminar.seminar5;

import java.util.Arrays;
import java.util.HashMap;


public class task1 {
    // Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. 
    // Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. 
// (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "add";
        System.out.println(isIsomorphic(s1, s2));
        System.out.println(isIsomorphic2(s1, s2));
    }

    public static boolean isIsomorphic(String s1, String s2){
        int[] s1Char = new int[256];
        int[] s2Char = new int[256];
        Arrays.fill(s1Char,-1);
        Arrays.fill(s2Char,-1);
        for(int i = 0; i < s1.length(); i++){
            int s1CharIndex = s1.charAt(i);
            int s2CharIndex = s2.charAt(i);
            if(s1Char[s1CharIndex] == -1 && s2Char[s2CharIndex] == -1){// если в обоих массивах ячейки -1 не заняты,то меняем буквы местами
                s1Char[s1CharIndex] = s2CharIndex;
                s2Char[s2CharIndex] = s1CharIndex;
            }else if(s1Char[s1CharIndex] != s2CharIndex || s2Char[s2CharIndex] != s1CharIndex){//если один из элементов массива уже занят индексом,значит строки не изоморфны
                return false;
            }

        }
        return true;
    }

    public static boolean isIsomorphic2(String s1, String s2){

        HashMap<Character,Integer> s1Char = getCounts(s1);
        HashMap<Character,Integer> s2Char = getCounts(s2);
        System.out.println(s1Char);
        System.out.println(s2Char);
        if(s1Char.size() != s2Char.size()) return false;
        for(int i = 0; i < s1.length(); i++){
            if(s1Char.get(s1.charAt(i)) != s2Char.get(s2.charAt(i))) return false;
        }
        System.out.println(s1.charAt(0));
        return true;
    }

    public static HashMap<Character,Integer> getCounts(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(map.containsKey(tmp)){
                map.put(tmp, map.get(s.charAt(i)) + 1);
            }else{
                map.put(tmp,1);
            }
        }
        return map;
    }
}
