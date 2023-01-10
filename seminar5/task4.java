package seminar.seminar5;

import java.util.LinkedHashMap;
import java.util.Map;



// из арабского числа сделать римское 
public class task4 {
    public static void makeRimNumber(int arab){
        LinkedHashMap<Integer,String> numbers = new LinkedHashMap<>(){{

            put(5000,"V_");
            put(4000,"MV");
            put(1000,"M");
            put(900,"CM");
            put(500,"D");
            put(400,"CD");
            put(100,"C");
            put(90,"XC");
            put(50,"L");
            put(40,"XL");
            put(10,"X");
            put(9,"IX");
            put(5,"V");
            put(4,"IV");
            put(1,"I");

        }
        };    
        System.out.println(numbers);
        while(arab !=0){
            for(int i : numbers.keySet()){
                while(i <= arab){
                    arab -= i;
                    System.out.print(numbers.get(i));
                }
            }
        }

    }

    public static void ArabToRoman(int n){
        LinkedHashMap<Integer,String> numbers = new LinkedHashMap<>(){{

            put(5000,"V_");
            put(4000,"MV");
            put(1000,"M");
            put(900,"CM");
            put(500,"D");
            put(400,"CD");
            put(100,"C");
            put(90,"XC");
            put(50,"L");
            put(40,"XL");
            put(10,"X");
            put(9,"IX");
            put(5,"V");
            put(4,"IV");
            put(1,"I");

        }
        };    

        String res = "";
        for(Map.Entry<Integer,String> elemEntry : numbers.entrySet() ){
            if(n >= elemEntry.getKey()){
                int temp = n /elemEntry.getKey();
                res += elemEntry.getValue().repeat(temp);
                n -=temp * elemEntry.getKey(); 
            }
        }
        System.out.println(res);
        
    }

    public static void main(String[] args) {
        makeRimNumber(2022);
        System.out.println();
        ArabToRoman(2022);
    }
}
