package concepts.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateOddAndEven {
        public static void main(String[] args) {
         List<Integer> list=Arrays.asList(1,2,3,4,5,6);
         list.stream().collect(Collectors.partitioningBy(i->i%2==0));

        }
}
