import java.lang.module.ModuleDescriptor.Builder;
import java.io.File;
import java.io.FileWriter;

public class task4 {

    //Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в 
    //простой текстовый файл, обработайте исключения.

    public static String test(String input){
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < 100; i++){
            res.append(input);
        }
        return res.toString();
    }

    public static void write_file(String file, String str)throws Exception{
        File f = new File(file);
        FileWriter fw = new FileWriter(f);
        fw.write(str);
        fw.flush();
        fw.close();
    }

    public static void main(String[] args) throws Exception {

        String res1 = test("Test");
        write_file("test.txt",res1);

        
    }
    
}
