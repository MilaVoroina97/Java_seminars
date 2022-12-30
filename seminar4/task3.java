package seminar.seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
public class task3 {
    public static List<Integer> makeList(){
        List<Integer> array = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        boolean run = true;
        
        do {
            System.out.print("Введите число: ");
            
            array.add(Integer.parseInt(in.nextLine()));
            
            System.out.print("Продолжить? (Д/Н): ");
            
            if (!in.nextLine().equalsIgnoreCase("Д")) {
                run = false;
            }           
        } while (run);
        
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("Число Nº%d = %d \n", i + 1, array.get(i));
        }
        
        System.out.print("Выход из программы.");
        
        in.close();    

        return array;
    }

    public static void makeStack(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static void makeQueue(int[] arr){
        Queue<Integer> que = new LinkedList<>();
        for(int j : arr){
            que.add(j);
        }
        while(!que.isEmpty()){
            System.out.println(que.poll());
        }
    }
}
