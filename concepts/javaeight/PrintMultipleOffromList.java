package concepts.javaeight;

import java.util.List;
import java.util.stream.Collectors;

public class PrintMultipleOffromList {
    public static void main(String[] args) {
        //Print multiple of 5 from list
        /*filter-yes
        mapping-no
        grouping-no
        sorting-no
        aggregation-no
        collecting-yes or just print
         */
        List<Integer> numbers=List.of(1,2,4,5,6,7,8,10,68,55);
        numbers.stream().filter(n->n%5==0).forEach(System.out::println);
        numbers.stream().filter(n->n%5==0).collect(Collectors.toList());
    }

}
