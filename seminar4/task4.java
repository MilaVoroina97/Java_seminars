package seminar.seminar4;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // write your code here
        int n = 0;
        Scanner keyboard = new Scanner(System.in);
    
        System.out.print("Введите количество строк: ");
    
        if (keyboard.hasNextInt()) {
            n = keyboard.nextInt();
        } else {
            System.out.print("Введены некорректные данные!");
    
        }
        String[] text = new String[n];
    
        keyboard.nextLine();
        for (int i = 0; i < n; i++) {
    
            System.out.printf((i + 1) + " ");

            StringBuffer sb = new StringBuffer(text[i]);
    
            sb = new StringBuffer(keyboard.nextLine());
        }
    
                System.out.println("String before sort: ");
                for (String element : text ) {
                    System.out.println(element);
                }
                Arrays.sort(text);
                System.out.println();
                System.out.println("String after sort: ");
                for (String element : text) {
    
    
                    System.out.println(element);
                }
            }


}
