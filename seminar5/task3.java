package seminar.seminar5;
import java.util.HashMap;

// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022
public class task3 {

    public static int makeArabicNum(String rim){
        HashMap<String,Integer> numbers = new HashMap<>(){{

            put("I",1);
            put("IV",4);
            put("V",5);
            put("IX",9);
            put("X",10);
            put("XL",40);
            put("L",50);
            put("XC",90);
            put("C",100);
            put("CD",400);
            put("D",500);
            put("CM",900);
            put("M",1000);
            put("MV",4000);
            put("V_",5000);
        }
        };
        int res = 0;
        String[] rims = rim.split("");
        for(int i = 0; i < rims.length; i++){
            if(rims.length - 1 > i){
                if(numbers.containsKey(rims[i] + rims[i+1])){
                    res += numbers.get(rims[i] + rims[i+1]);
                    i++;
                }else{
                    res += numbers.get(rims[i]);
                }
            }else{
                res += numbers.get(rims[i]);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        String rim = "MMCMLXXXIX";
        System.out.println(makeArabicNum(rim));
    }
}

