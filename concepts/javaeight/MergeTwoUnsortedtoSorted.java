package concepts.javaeight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class MergeTwoUnsortedtoSorted {
    public static  void main(String[] args) {
        int []a={1,2,3,4,56};
        int[]b={6,3,4,6,8};
        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(array));

        int[] array1 = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().boxed()
                .sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();
        System.out.println(array1);
    }
}
