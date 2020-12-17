
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

public class Solution {

    private static Iterable<String> it = () -> new Scanner(System.in);
    private static Iterable<String> repeat = () -> new Scanner(System.in);
    static LongToIntFunction ob = a -> (int) a;
    static LongBinaryOperator biOperator = (a, b) -> a + b;
    static IntToLongFunction unOperator = a -> (long) a;
    static ToIntFunction toIntFunction = a -> (int) a;
    static Predicate<long[]> nullArray = x ->
    {
        if (x == null)
            return true;
        return false;
    };
    static AtomicInteger v = null;

    public static boolean isNumber(String b) {

        try {
            Integer.parseInt(b);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public static int beginIndex = 0;
    static int endIndex = 0;
    static long elem = 0l;
    static int m = 0;
    static int n = 0;
    static int index = 0;

    static long[] fill = new long[11];
    static long[] fillFinal = new long[11];


    public static long[] adder(long[] fill, int beginIndex, int endIndex) {
        AtomicInteger v = new AtomicInteger(-1);
        beginIndex = ob.applyAsInt(fill[v.incrementAndGet()]);
        endIndex = ob.applyAsInt(fill[v.incrementAndGet()]);
        elem = fill[v.incrementAndGet()];
        if (v.get() < fill.length - 2) {

            for (; beginIndex <= endIndex; beginIndex++) {
                fillFinal[beginIndex] += elem;
            }
            beginIndex = ob.applyAsInt(fill[v.incrementAndGet()]);
            endIndex = ob.applyAsInt(fill[v.incrementAndGet()]);
            elem = fill[v.incrementAndGet()];
        }
        return null;
    }


    public static void main(String[] args) {
        AtomicInteger c = new AtomicInteger();
        AtomicInteger d = new AtomicInteger();
        // String[] validations = {"\\r", "\\m", "\\|", "\\[\r\u2028\u2029\u0085])?+"};
        StreamSupport.stream(it.spliterator(), false).skip(2).map(i -> fill[c.getAndIncrement()] = Long.parseLong(String.valueOf(i))).forEach(i -> adder(fill, 0, 0));


    }


}
