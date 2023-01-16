package seminar.seminar6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        Set<Laptop> laptops = fillSet();
        Scanner sc = new Scanner(System.in);
        List<String> criteriesStrings = Arrays.asList("2","3","5");
        List<String> criteriesInt = Arrays.asList("1","4");
        Map<String,String> userInput = new HashMap<String,String>();
        printLaptop(laptops, userInput);
        while(true){
            System.out.println("Choose an option: ");
            System.out.println("1 - hardDisk (Гб) : ");
            System.out.println("2 - brand : ");
            System.out.println("3 - operatingSystem : ");
            System.out.println("4 - processor : ");
            System.out.println("5 - videocarta : ");
            System.out.println("0 - Сброс");
            System.out.println("-1 - Выход");
            System.out.print("Номер критерия-->");
            String input1 = sc.nextLine();
            if(input1 != null) input1.trim(); else continue;
            if(input1.equalsIgnoreCase("-1")) break;
            if(input1.equalsIgnoreCase("0")) {
                userInput.clear();
                printLaptop(laptops, userInput);
            }
            if(criteriesStrings.contains(input1) || criteriesInt.contains(input1)){
                System.out.println("Enter value: ");
                String input2 = sc.nextLine();
                if(input2 != null) input2.trim(); else continue;
                if(input2.equals("")) userInput.put(input1,input2);
                else{
                    if(criteriesStrings.contains(input1)){
                        userInput.put(input1,input2);
                    }else{
                        try{
                            Integer i = Integer.parseInt(input2);
                            userInput.put(input1,input2);

                        }catch (NumberFormatException e) {
                            System.out.println();
                            System.out.println("!!!!!!Для числового критерия (" + input1 + ") введено нечисловое значение");
                            continue;
                        }
                    }
                }
                printLaptop(laptops, userInput);
            }else{
                System.out.println();
                System.out.println(String.format("!Критерий %s отсутствует", input1));
            }
            
        }
    }

    private static boolean sort(Laptop l, Map<String,String> userIput){
        boolean res = true;
        for(String input : userIput.keySet()){
            String value = userIput.get(input);
            if(value == null || value.trim().equals("")) continue;
            if(input.equals("1")){
                try{
                    Integer i =  Integer.parseInt(value);
                    if(l.getHardDisk() >= i){

                    }else{
                        res = false;
                        break;
                    }
                }catch (NumberFormatException e){
                    res = false;
                    break;
                }
            }else if(input.equals("2")){
                if(l.getBrand().equalsIgnoreCase(value)){

                }else{
                    res = false;
                    break;
                }
            }else if(input.equals("3")){
                if(l.getOperatingSystem().equalsIgnoreCase(value)){

                }else{
                    res = false;
                    break;
                }
            }else if(input.equals("4")){
                try{
                    Integer i = Integer.parseInt(value);
                    if(l.getProcessor() >= i){

                    }else{
                        res = false;
                        break;
                    }
                }catch (NumberFormatException e){
                    res = false;
                    break;
                }
            }else if(input.equals("5")){
                if(l.getVideocarta().equalsIgnoreCase(value)){

                }else{
                    res = false;
                    break;
                }
            }
        }
        return res;
    }

    private static void printLaptop(Set<Laptop> laptops, Map<String,String> userInput){
        List<String> forPrint = new ArrayList<String>();
        for(Laptop l : laptops){
            if(sort(l, userInput)){
                String s = String.format("S/N:%12s: ОЗУ(Гб):%d, Brand : %s, OperatingSystem : %s, Processor : %d , Videocarta : %s ",
                l.getSerialNumber(),
                l.getHardDisk(),
                l.getBrand(),
                l.getOperatingSystem(),
                l.getProcessor(),
                l.getVideocarta()
                 );
                forPrint.add(s);
            }
        }
        System.out.println();
        System.out.println(String.format("***Ноутбуки. Результат (%d из %d)", forPrint.size(), laptops.size()));
        for(String s : forPrint){
            System.out.println(s);
        }

    }

    private static Set<Laptop> fillSet(){
        String OS_WINDOWS_10 = "Windows 10";
        String OS_LINUX_UBUNTU = "Linux Ubuntu 22.04 LTS";

        Set<Laptop> set = new HashSet<Laptop>();
        //
        set.add(new Laptop(
                "W123456",
                15,
                "ASUS",
                OS_WINDOWS_10,
                5,
                "AMD"
        ));
        set.add(new Laptop(
                "L234567",
                17,
                "Apple",
                "IOS",
                10,
                "Nvidia"
        ));
        set.add(new Laptop(
                "L234567WT",
                17,
                "Philips",
                OS_LINUX_UBUNTU,
                15,
                "AMD"
        ));
        set.add(new Laptop(
                "W123456BLU",
                15,
                "Samsumg",
                OS_LINUX_UBUNTU,
                15,
                "Nvidia"
        ));

        return set;
    }
}
