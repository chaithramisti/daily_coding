package concepts.javaeight;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Mergeandunique {
    public static void main(String args[]){
        int[] a={1,2,3,4};
        int[]b={34,5,6,7};
       int[]c= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
       System.out.println(c);
    }
}
