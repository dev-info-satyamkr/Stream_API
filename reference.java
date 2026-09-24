package StreamAPI;
import java.util.List;
import java.util.Arrays;

public class reference
 {
   public static void main(String[] args)
   {
    List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9);

    values.forEach(reference :: doubleit); 
   } 
   public static void doubleit(int i)
   {
    System.out.println(i*2);
   }
}
