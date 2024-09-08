// This is Dynamic Array : that is simiar to cpp vectors the size need not to be defined.

import java.util.ArrayList;
import java.util.Scanner;
public class Dynamic_array_list06 {
   public static void main(String[] args) {
    // Syntax
   ArrayList<Integer> list = new ArrayList<>(10);
   Scanner in = new Scanner(System.in);
   // you can add as mush u want its dynamic in size
   /*
   
   list.add(67);
   list.add(11);
   list.add(213);
   list.add(214);
   list.add(45);
   list.add(46);
   list.add(646);
   list.add(110);
   list.add(67);
   list.add(67);
   list.add(67);
   list.add(67);
   list.add(67);
   
   
   System.out.println(list.contains(214)); //this checks if the array contains 214 or not.
   System.out.println("List before update :"+list);
   System.out.println(list.set(0, 99));     //this replaces the value of 0th index to 99
   list.remove(2);     //used to remove the element at index no 2
   System.out.println("List after update :"+list);
   
   */
//   input
   for(int i=0;i<5;i++)
   {
      list.add(in.nextInt());
   }
   // get item at any index
   for(int i=0;i<5;i++)
   {
      System.out.println(list.get(i)); //pass index here, list[index] will not work here.
   }
   System.out.println(list);

   
   } 
}
