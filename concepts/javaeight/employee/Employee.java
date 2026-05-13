package concepts.javaeight.employee;

import lombok.*;

@AllArgsConstructor
@Data
@ToString
public class Employee {
    String name;
    String department;
    int salary;
}
