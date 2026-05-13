package concepts.javaeight;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
       String s="hello world";
       //Frequency of each character in a string
        //filtering-no  map- string to character grouing -yes ,sorting-no,aggregation-yes
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

                System.out.println(collect);
                s.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
                s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
                
    }

}
