import java.util.Scanner;
public class task2 {
    public static void formatter(int counter,char ch){
        if(counter !=1){
            System.out.printf("%s%d",ch,counter);
        }else{
            System.out.printf("%s",ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        // System.out.println("Result here: ");
        // int counter = 1;
        // for(int i = 0; i < str.length()-1;i++){
        //     if(str.charAt(i) == str.charAt(i+1)){
        //         counter++;
        //     }else{
        //         formatter(counter,str.charAt(i));
        //         counter = 1;
        //     }
        // }
        // formatter(counter, str.charAt(str.length()-1));
        // sc.close();
        char first = str.charAt(0);
        int count = 1;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(first == str.charAt(i)){
                count++;
            }else{
                if(count > 0){
                    res.append(first).append(count);}

                count = 1;
                first = str.charAt(i);

                }
            }
            if(count > 0){
                res.append(first).append(count);
            }else{
                res.append(first);
            }
            System.out.println(res);
        }




        
    }

