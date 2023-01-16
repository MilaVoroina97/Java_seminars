package seminar.seminar6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class task {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mila", "Pulson", 4, "Siam", Arrays.asList("Beshensto","Vitamin A"));
        Cat cat2 = new Cat("Kesha", "Pulson", 4, "Siam", Arrays.asList("Beshensto","Vitamin A"));
        Cat cat3 = new Cat("Barsik", "Katya", 5, "Britain", null);
        Cat cat4 = new Cat("Niki", "Sveta", 6, "Britain", Arrays.asList("Beshensto","Vitamin A","Vit B"));
        Cat cat5 = new Cat("Yell", "Misha", 6, "Amurskya", Arrays.asList("Beshensto","Vitamin A","Vit B"));
        Cat cat6 = new Cat("Mila", "Pulson", 4, "Siam", Arrays.asList("Beshensto","Vitamin A"));


        Set<Cat> setOfCats = new HashSet<>();
        setOfCats.add(cat1);
        setOfCats.add(cat2);
        setOfCats.add(cat3);
        setOfCats.add(cat4);
        setOfCats.add(cat5);
        setOfCats.add(cat6);
        System.out.println(setOfCats);
        System.out.println(cat1.getInject());
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(setOfCats);

    }
}
