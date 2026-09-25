package StreamAPI;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BiFunction 
{
    public static void main(String[] args)
    {
        Function<Integer, Integer> f = new Function<Integer, Integer>()
        {
            public Integer apply (Integer i)
            {
                return i*2;
            }
        };
        BinaryOperator<Integer> b = new BinaryOperator<Integer>()
        {
            public Integer apply(Integer i, Integer j)
            {
                return i+j;
            }
        };
        List<Integer> values = Arrays.asList(1, 2, 3);
        Stream<Integer> s = values.stream();

        Stream<Integer> s1 = s.map(f);
        Integer result = s1.reduce(0, b);

        System.out.println(result);;
    }
}
