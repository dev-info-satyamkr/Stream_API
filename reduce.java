package StreamAPI;
import java.util.List;
import java.util.Arrays;

public class reduce 
{
   public static void main(String[] args)
   {
    List<Integer> Values = Arrays.asList(1,2,3,4,5,6,7,8,9);

    // int result = 0;

    // for(int i : Values)
    // {
    //     result += i*2;

    // }
    System.out.println(Values.stream() .map(i -> i*2) .reduce(0, (c,e) -> c+e));
   }    
}
