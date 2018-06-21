import java.util.*;
class best {
  public static void main(String[] args) {
 
HashSet<Integer>set1 = new HashSet<Integer>();
set1.add(12);
set1.add(13);
set1.add(14);
set1.add(15);
System.out.println("Frist Set content: "+set1);
HashSet<Integer>set2 = new HashSet<Integer>();
set2.add(12);
set2.add(13);
set2.add(14);
set2.add(27);
System.out.println("Second Set content: "+set2);
set1.retainAll(set2);
System.out.println("HashSet content:");
System.out.println(set1);
     }
}