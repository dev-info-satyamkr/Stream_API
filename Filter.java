package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter
 {
   public static void main(String[] args)
   {
    List<Integer> values = Arrays.asList(12,20,50,46,75,95,85);
    {
        int result =0;
        for(int i : values)
        {
            if(i%5 ==0)
            {
                result += i;
            }
        }
        System.out.println(result);

        System.out.println(values.stream().filter(i -> i%5==0).reduce(0,(c,e) -> c+e));
    }
   } 
}
