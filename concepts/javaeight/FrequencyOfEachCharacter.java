package concepts.javaeight;

import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
       String s="hello world";
       Map<Object, Long> answer=s.chars().mapToObj(c->(char)c).collect(
               Collectors.groupingBy(c->c,Collectors.counting()
               )
       );
       System.out.println(answer);
    }
}
