package seminar.seminar6;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    public int counter;
    private int id;
    private String name;
    public String owner;
    private int age;
    private String breed;
    private List<String> injections;

    public Cat(String name, String owner, int age, String breed, List<String> injections){

        this.id = counter++;
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.breed = breed;
        this.injections = new ArrayList<>();

    }

    public void addInject(String nameOfInject){
        this.injections.add(nameOfInject);
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getOwner(){
        return this.owner;
    }

    public int addAge(){
        return this.age++;
    }

    public String getBreed(){
        return this.breed;
    }

    public List<String> getInject(){
        return this.injections;
    }

    @Override
    public String toString(){
        return "ID : " + this.id + "\nName : " + this.name + "\nAge : " + this.age + "\nBreed : " + this.breed + "\nOwner : " 
        + this.owner + "\nAll injections : " + this.injections;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Cat cat = (Cat) obj;
        return (cat.breed.equals(this.breed) && cat.age == this.age);
    } 

    @Override
    public int hashCode(){
        return this.age;
    }

     
    
}
