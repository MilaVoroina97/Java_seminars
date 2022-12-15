import java.util.Scanner;

import javax.security.auth.kerberos.KerberosCredMessage;


public class task1 {
// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

public static int getInt(){
    System.out.println("Enter the number: ");
    int num;
    Scanner iScanner = new Scanner(System.in);

    if(iScanner.hasNextInt()){
        num = iScanner.nextInt();
    }else{
        System.out.println("Enter error");
        iScanner.next();
        num = getInt();

    }
    return num;
} 

public static char[] getChar(){
    System.out.println("Enter the char: ");
    char[] ch = new char[2];
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i < 2; i++){
        System.out.printf("Enter the char %d",i+1);
        ch[i] = sc.next().charAt(0);
    }
    return ch;
}
    public static void main(String[] args) {

        int n = getInt();
        char[] t = getChar();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < n; i++){
            res.append(t[0]);
            res.append(t[1]);
        }
        System.out.println(res);

        Scanner sic = new Scanner(System.in);
        String r = sic.next().replaceAll("[^0-9]","");
        if(r.equals("")){
            System.out.println("Enter error");
            return;
        }
        int k = Math.abs(Integer.parseInt(r)/2);
        StringBuilder str = new StringBuilder();
        if(k % 2 == 0){
            while(k > 0){
                str.append("c1c2");
                k--;
            }
            System.out.println(str.toString());
        }else{
            System.out.println("You should enter odd num");
        }



    }
    
}
