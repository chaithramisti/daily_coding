package concepts.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheListInReverseOrder {
    public static void main(String[] args) {
       /*
       filter-no
       mapping-no
       groping-
       sorting-yes
       aggregation-no
       collecting-yes
        */
        List<String> sList= Arrays.asList("Chaithra","Priya","Pallavi","Suma","Rashmi","Navya");
       // List<String> collect = sList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       // System.out.println(collect);
        //Contrl+2 then you will get suggestion assign to local variable
        List<String> collect = sList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
System.out.println(collect);

    }
}
