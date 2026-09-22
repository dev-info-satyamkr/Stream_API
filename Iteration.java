package StreamAPI;

import java.util.List;
import java.util.Arrays;

public class Iteration 
{
   public static void main (String[] args)
   {
    List<Integer> Values =Arrays.asList(1,2,3,4,5,6);

    for(int i=0;i<6;i++)
    {
      System.out.println(Values.get(i));
        }    
   }    
}
