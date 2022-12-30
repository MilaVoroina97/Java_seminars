package seminar.seminar4;
import java.util.LinkedList;
import java.util.Scanner;
public class task1_1 {

    public static LinkedList<String> res = new LinkedList<String>();

    public static void AddNum(String text, int num){
        try{
            res.add(num,text);
        }catch (Exception e){
            System.out.println(e);
            while(res.size() < num){
                res.add(null);
            }
            res.add(text);
        }
    }

    public static void PrintText(int num){
        if(res.size() < num){
            System.out.println("Element not founded");
        }else{
            String text = res.get(num);
            res.remove(num);
            System.out.println(text);
        }
    }

    public static boolean isExist(String text){
        return text.equals("exist");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter string or exist to out");
            String user_input = sc.nextLine();
            if(isExist(user_input)) break;
            String[] user_arr = user_input.split("~");
            String text = user_arr[0];
            try{
                int num = Integer.parseInt(user_arr[1]);
                if(text.equals("print")){
                    PrintText(num);
                }else{
                    AddNum(text, num);
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                AddNum(user_input,res.size());
            }

            System.out.println(res);
        }
        sc.close();

    }
}
