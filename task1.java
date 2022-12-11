package seminar;


public class task1 {
    // Дан массив чисел[1,1,0,1,1] вывести максимальное количество 1, которые идут подряд

    // public static void main(String[] args) {
    //     int[] one = new int[]{1,1,0,1,0,1,1,1,1,0,1,0,1};
    //     int findNumber = 1;
    //     int count = 0;
    //     int countMax = 0;
    //     int len = one.length - 1;
    //     for(int i: one){
    //         if(findNumber == i){
    //             count++;
    //             if(len == 0){
    //                 if(count >= countMax){
    //                     countMax = count;
    //                 }

    //                 count=0;
    //             }
    //         }else{
    //             if(count >= countMax){
    //                 countMax = count;
    //             }
    //             count = 0;

    //         }
    //         len--;
    //     }
    //     System.out.println(countMax);
    // }

    // public static void main(String[] args) {
        
    //     int[] arr = new int[]{1,1,0,0,1,1,1,1,1,0,1};
    //     int count = 1;
    //     int countMax = 0;
    //     for(int i = 0; i < arr.length-1; i++){
    //         if((arr[i] == 1) && (arr[i] == arr[i+1])){
    //             count++;
    //             if(countMax < count){
    //                 countMax = count;

    //             }
    //         }else{

    //             // countMax = count;
    //             count = 1;
    //         }
    //     }
    //     System.out.println(countMax);

    // }

    // public static void main(String[] args) {
    
    //     int[] one = new int[]{1,1,1,0,1,1,0,1,1,1,1,1,1,0,1};
    //     int count = 0;
    //     int countMax = 0;
    //     for(int i = 0; i < one.length; i++){
    //         if(one[i] == 1){
    //             count++;
    //             if(count > countMax){
    //                 countMax =count;
    //             }
    //         }else{
    //             if(count > countMax){
    //                 countMax = count;
    //             }
    //             count = 0;
    //         }
    //     }
    //     System.out.println(countMax);
    // }

    public static void main(String[] args) {
        int[] ones = new int[]{1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1};
        int countMax = 0;
        for(int i = 0; i < ones.length; i++){
            int count = 0;
            while(i < ones.length && ones[i] == 1){
                count++;
                i++;
            }
            if(count > countMax){
                countMax = count;
            }
        }
        System.out.println(countMax);
    }


    
}
