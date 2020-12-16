
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Solution {

    private static Iterable<String> it = () -> new Scanner(System.in);
    static  LongToIntFunction ob = a -> (int)a;
    static LongBinaryOperator biOperator = (a , b) -> a+b;
    static IntToLongFunction unOperator = a -> (long) a;

    public static boolean isNumber(String b) {

       try {
           Integer.parseInt(b);
           return true;
       } catch(NumberFormatException e) {
           return false;
       }
    };
    public static int beginIndex = 0;
    static int endIndex = 0;
    static int m=0;
    static int n=0;
    static int index = 0;
    static int i = 0;
    static long[] fill = new long[0];
    private static long[] finalFill;


    public static void main(String[] args) {

      // long[] fillFinal =  new long[n];

        AtomicInteger c = new AtomicInteger();
        AtomicInteger v = new AtomicInteger();


        String[] validations =  {"\\r","\\m", "\\|" , "\\[\r\u2028\u2029\u0085])?+"};
        long[] fillFinal = new long[0];
        long[] fill = new long[11];

   List<Long> ll =  StreamSupport.stream(it.spliterator(),  false)
               .map(i ->fill[c.getAndIncrement()] = Long.parseLong(i)).map(i-> c.getAndSet(0)).filter(i  -> c.getAndIncrement() <= fill.length)
                .map(beginIndex -> beginIndex = Math.toIntExact(fill[c.getAndIncrement()])).map(endIndex -> endIndex = Math.toIntExact(fill[c.getAndIncrement()])).map(p -> finalFill = new long[11]).filter(i -> beginIndex <= endIndex).map(i ->  finalFill[beginIndex++] = finalFill[beginIndex] += fill[c.getAndIncrement()]).collect(Collectors.toList());


        //mapToLong(i -> fill[data.getAndIncrement()] = Long.parseLong(String.valueOf(i))).
        //map(i -> LongStream.range(fill[in.incrementAndGet()], fill[in.incrementAndGet()])).filter(p -> fill.length <= in.incrementAndGet()).mapToLong(p -> (fillFinal[(int) fill[in.incrementAndGet()]] = fill[in.incrementAndGet()] + fill[in.incrementAndGet()])).forEach(System.out::println);m
        // System.out.println(stream.max().getAsLong());
      //  filter(i -> c.incrementAndGet() <= validations.length ).filter(i -> Boolean.parseBoolean(i = validations[v.get()])).
      //  mapToInt(n ->Integer.parseInt(String.valueOf(m))==0 ? Integer.parseInt(n) : Integer.parseInt(n))
        //        .mapToObj(m-> Integer.parseInt(String.valueOf(m)) == m ?  Integer.parseInt(String.valueOf(m))  : 0)
    }



}
