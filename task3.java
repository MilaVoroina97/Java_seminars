package seminar;

import java.util.ArrayList;

public class task3 {
    public static String common_str(String[] mas){

        if(mas.length == 0){
            return "";
        }
        String prefix = mas[0];

        for(var m : mas){
            int k = m.indexOf(prefix);
            System.out.printf("m:"+ m);
            System.out.println();
            System.out.printf("k:"+ k);
            System.out.println();
            while(m.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.printf("pr:"+prefix);
                System.out.println();
                if(prefix.isEmpty()){
                    return "";
                }
    
            }
        }
        return prefix;
    }

    public static String compare_two (String str1, String str2){
        String res = "";
        int n1 = str1.length();
        int n2 = str2.length();
        for(int i = 0, j = 0; i <= n1-1 && j <= n2 -1; i++, j++){
            if(str1.charAt(i) !=str2.charAt(j)){
                break;
            }
            res += str1.charAt(i);

        }
        return res;

    }

    public static String common_pr(String[] arrs){
        String prefix = arrs[0];
        int n = arrs.length;
        for(int i = 1; i <= n-1; i++){
            prefix = compare_two(prefix, arrs[i]);
        }
        return prefix;
    }
    public static void main(String[] args) {

        String arr[] = {"geeksforgeeks", "geeks","geek", "geezer","geedfsf","geeefg"};
        String res = common_str(arr);
        System.out.println(res);
        String res1 = common_pr(arr);
        System.out.println(res1);
        ArrayList<String> list = new ArrayList<>();
        list.add("Сила");
        list.add("Воля");
        list.add("Упорство");
           for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j <list.get(i).length(); j++) {
                    if (list.get(i).charAt(j) == 'л') {
                        System.out.println(list.get(i));
                    }
                }
           }

        
    }
}
