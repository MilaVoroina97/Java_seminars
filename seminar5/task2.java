package seminar.seminar5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

// написать программу определяющую правильность расстановки скобок в выражении 
public class task2 {
    public static boolean checkBrackets(String exp){
        Deque<Character>stack = new ArrayDeque<>();
        for(int i = 0; i < exp.length(); i++){
            char e = exp.charAt(i);
            System.out.println("e : " + e);
            if(e == '[' || e == '{' || e == '('){
                stack.push(e);
                for(char h : stack){
                    System.out.println("n : " + h);
                }
                continue;
            }

            if(stack.isEmpty()) return false;
            char check;
            switch(e){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[') return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[') return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '(' || check =='{') return false;
                    break;
            }

        }
        return(stack.isEmpty());
    }

    public static String checkBrackets2(String exp){
        HashMap<String, Integer> openBrackets = new HashMap<String, Integer>() {{
            put("{", 0);
            put("[", 1);
            put("(", 2);
            put("<",3);
        }};
        HashMap<String, Integer> closeBrackets = new HashMap<String, Integer>() {{
            put("}", 0);
            put("]", 1);
            put(")", 2);
            put(">",3);
        }};

        char[] brackets = {'{','[','(','<','}',']',')','>'};
        Deque<String> res = new ArrayDeque<>();
        String answer = "correct";
        for(char symbol : brackets){
            System.out.println(symbol);
            String e = Character.toString(symbol);
            if(openBrackets.containsKey(e)){
                res.push(e);
            }else if(closeBrackets.containsKey(e)){
            if(res.isEmpty() && !openBrackets.get(res.pop()).equals(closeBrackets.get(e))){
                answer = "incorrect";
                break;
            }
            
            
        }
    }
    return answer;
}

    



    public static void main(String[] args) {
        System.out.println(checkBrackets("[]"));
        System.out.println(checkBrackets2("[]"));
    }
}
