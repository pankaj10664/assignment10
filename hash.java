import java.util.*;  
class don {  
  public static void main(String args[]) {  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Rajeev");
  hash_map.put(1, "Rajeev");
  hash_map.put(2, "pankaj");
  hash_map.put(3, "Bipin");
  hash_map.put(4, "sudhir");
  hash_map.put(5, "ankush");
  System.out.println("key"+" "+"value");

  for(Map.Entry x:hash_map.entrySet()){ 
   System.out.println(x.getKey()+" "+x.getValue());  
  }  
 }  
}