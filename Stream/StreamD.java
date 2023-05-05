package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamD {
    private static Stream<Integer> stream;
    private static Stream<Integer> transformedStream;
    private static char[] sum;
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(13,12,45,30,95,4);

        // System.out.println(list);


        /**int sum=0;
        for(int n:list){
            if(n%5==0)
            {
                n=n-5;
                sum=sum+n;
            }
        }
        System.out.println("Divisible by 5 and sum is: ");
        System.out.println(sum);*/

        Predicate<Integer> Predicate=t->t%2==0;
        Function<Integer,Integer>fn=t->t-2;
        BinaryOperator<Integer> bin=(t,u)->t+u;
        int result = list.stream()
            .filter(d->d%2==0)
            .map(s->s-5)
            .reduce(0,(k1,k2)->k1+k2);
        System.out.println(result);

        
        // Stream<Integer> stream = list.stream();
        // Stream<Integer> Evenstream = stream.filter(k->k%2==0);
        // Stream<Integer> transformedStream = Evenstream.map(k->k-2);
        // int sum = transformedStream.reduce(0,(p,q)->p+q);
        // System.out.print(sum);

    
        /**Stream<Integer> sortedStream = list.stream().filter(k->k%2==0).sorted();
        sortedStream.forEach(k->System.out.println(k));
        transformedStream.forEach((t)->System.out.println(t));
        stream.forEach((t)->System.out.println(t));*/


        // Consumer<Integer> Con = (t) -> System.out.println(t);
        // list.forEach(Con);
        // System.out.println(sum);
        //or
        //



        
    }
    
}
