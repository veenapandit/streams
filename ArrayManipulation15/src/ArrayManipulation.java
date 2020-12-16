
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import java.util.stream.*;

public class ArrayManipulation {
    private static final Scanner scanner = new Scanner(System.in);


    static long arrayManipulation(int n, int m, long[] fill) {
        int k = fill.length;
        long[] fillNew = new long[m];
        long[] elements = new long[m];

        Arrays.stream(fillNew).forEach(System.out::println);

        return 0l;

    }


    public static void main(String[] args) throws IOException {
        //   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        long[] fill = new long[m * 3];
        int k = 0;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < m; j++) {

                fill[k++] = scanner.nextLong();

                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            }
        }

        long result = arrayManipulation(n, m, fill);
       // Arrays.stream(fill).forEach(System.out::println);


//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}