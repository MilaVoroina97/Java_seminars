package seminar.seminar4;
// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
import java.util.Stack;
import java.util.Scanner;
public class task2 {
public static void main(String[] args) {
    Stack<String> text = new Stack<>();
    Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("Enter ");
        String user_int = sc.nextLine();
        switch(user_int){
            case "exit":
                sc.close();
                return;
            case "print":
                while(!text.isEmpty()){
                    System.out.println(text.pop());
                }
                break;
            case "revert":
                text.pop();
                break;
            default:
                text.push(user_int);
                break;
        }
   }
}
}
