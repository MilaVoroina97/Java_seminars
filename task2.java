package seminar;

// import java.util.ArrayList;


// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
public class task2 {


    // public static void main(String[] args) {
        
    //     int[] arr = new int[]{3,2,2,3,2,3};
    //     int value = 3;
    //     int last = arr.length -1;
    //     while(last > 0 && arr[last] == value){
    //         last--;
        
    //     for(int i = 0; i < last; i++){
    //         if(arr[i] == value){
    //             for(int j = 0; j < last; j++){
    //                 arr[j] = arr[j+1];
    //             }
    //             arr[last] = arr[i];
    //             last--;
    //         }
    //     }
    // }
    // for(int k: arr){
    //         System.out.println(k);
    //     }
    // }
    
    // public static void main(String[] args) {
    //     int[] arr = new int[]{3,2,2,3,2,3,1,5,6,3};
    //     int val = 3;
    //     int[] arr1 = new int[arr.length];
    //     int last = arr.length - 1;
    //     int start = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == val){
    //             arr1[last] = val;
    //             last--;
    //         }else{
    //             arr1[start] = arr[i];
    //             start++;
    //         }
    //     }
    //     for(int k : arr1){
    //         System.out.println(k);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr = new int[]{3,2,2,3,2,3,1,5,6,3};
    //     ArrayList<Integer> arr1= new ArrayList<Integer>();
    //     int val = 3;
    //     int count = 0;
    //     for(int i : arr){
    //         if(i != val){
    //             arr1.add(i);
    //         }
    //         else{
    //             count++;
    //         }
    //     }
    //     for(int j = count; j != 0; j--){
    //         arr1.add(val);
    //         count--;
    //     }
    //     System.out.println(arr1);
    // }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3,2,3,1,5,6,3};
        int val = 3;
        int[] res = new int[arr.length];
        int count = 0;
        int iter = 0;
        for(int i : arr){
            if(i == val){
                count++;
            }else{
                res[iter] = i; // 
                iter++;
            }
        }
        for(int j = iter; j < iter + count; j++){
            res[j] = val;

        }
        for(int k : res){
            System.out.println(k);
        }
    }

}
