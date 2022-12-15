import java.util.Scanner;
public class task3 {

    public static void main(String[] args) {
        
        boolean res = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String pol = sc.nextLine();
        for(int i = 0; i < pol.length() / 2;i++){
            if(pol.charAt(i) != pol.charAt(pol.length()- 1 - i)){
                res = false;
            }else{
                res = true;
            }

        }
        System.out.println(res);
        sc.close();
    }
    
}
