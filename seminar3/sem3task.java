package seminar.seminar3;

import java.util.*;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
public class sem3task {

    
   // public static void main(String[] args) {

   //    ArrayList<String> planets = new ArrayList<>();
   //    planets.add("Venera");
   //    planets.add("Earth");
   //    planets.add("Venera");
   //    planets.add("Earth");
   //    planets.add("Mercury");
   //    planets.add("Jupiter");
   //    planets.add("Earth");
   //    planets.add("Jupiter");
   //    planets.add("Earth");
   //    planets.add("Neptyn");
   //    planets.add("Earth");
   //    planets.add("Jupiter");
   //    // ArrayList<String> result = countPlanets(planets);
   //    // System.out.println(result);
   //    ArrayList<String> result2 = countPlanets2(planets);
   //    System.out.println(result2);

    
   // } 

   // public static ArrayList<String> countPlanets(ArrayList<String>plt){
   //    ArrayList<String> res = new ArrayList<>();
   //    for(int i = 0; i < plt.size(); i++){
   //       int count = 0;
   //       for(int j = 0; j < plt.size(); j++){
   //          if(plt.get(j).equals(plt.get(i))){
   //             count +=1;
   //          }
   //       }
   //       if(!res.contains(plt.get(i))){//если в новом списке нет уже повторяющихся значений
   //          System.out.println(plt.get(i) + ":" + count);
   //          res.add(plt.get(i));
   //       }
   //    }
   //    return res;
   // }

   // public static ArrayList<String> countPlanets2(ArrayList<String>plt2){
   //    ArrayList<String> res = new ArrayList<>();
   //    for(String text: plt2){
   //       if(!res.contains(text)){
   //          System.out.println(text + ":"+ plt2.stream().filter(i -> Objects.equals(i,text)).count());
   //       }
   //       res.add(text);
   //    }
   //    return res;
   // }

   public static void main(String[] args) {
      ArrayList<String> planets = new ArrayList<>(Arrays.asList("Venera","Earth","Venera","Sun","Earth","Neptyn","Jupiter","Sun","Earth","Jupiter","Earth","Venera","Sun","Mercury","Jupiter","Osmo","Platon","Osmo","Mercury","Osmo"));
      ArrayList<String> pltRes = new ArrayList<>();
      for(int i = 0 ; i < planets.size(); i++){
         pltRes.add(planets.get(new Random().nextInt(9)));
      }

      System.out.println(planets);
      System.out.println(pltRes);
      HashMap<String,Integer>pltMap = new HashMap<String,Integer>();
      for(String planet: planets){
         if(pltMap.get(planet) == null){
            pltMap.put(planet,1);
         }else{
            pltMap.put(planet, pltMap.get(planet) + 1);
         }

      }
      for(Map.Entry<String, Integer> elem : pltMap.entrySet()){
         System.out.println(elem.getKey() + ":" + elem.getValue());
      }


      for(Map.Entry<String,Integer> item : pltMap.entrySet()){
         if(item.getValue() > 1){
            while(planets.contains(item.getKey())){
               planets.remove(item.getKey());
            }
         }
      }
      System.out.println(planets);
   }
}

