package seminar.seminar4;
// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида
// text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
import java.util.LinkedList;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        LinkedList<String> user_arr = new LinkedList<String>();
        int len = user_arr.size();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Please enter text~num: ");
            String user_input = sc.nextLine();
            if(user_input.equals("stop")) break;
            String[] arr = user_input.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            if(text.equals("print")){
                if(num > len){
                    System.out.println("Element was not founded");
                }else{
                    System.out.println(user_arr.get(num));
                    user_arr.remove(num);
                    len = user_arr.size();
                }
            }
            if(num > len){
                for(int i = len; i < num + 1; i++){
                    if(i == num){
                        user_arr.add(text);
                    }else user_arr.add(null);
                }
                len = user_arr.size();
            }else user_arr.add(num,text);

        }

        sc.close();
        System.out.println(user_arr);
    }
}
