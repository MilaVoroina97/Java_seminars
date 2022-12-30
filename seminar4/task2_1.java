package seminar.seminar4;
import java.util.LinkedList;
import java.util.Scanner;
public class task2_1 {
    public static void main(String[] args) {
        LinkedList<String> text = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter: ");
            String us = sc.nextLine();
            if(us.equals("exit")) {
                System.out.println(text);
                break;
            }
            else if(us.equals("print")){
                System.out.println(text);
                
            }else if(us.equals("revert")){
                if(text.size() > 0){
                    text.removeFirst();
                    System.out.println(text);
                    
                }else{
                    System.out.println("List is empty.");
                }
            }else{
                text.addFirst(us);
            }

        }
        sc.close();
    }
}
