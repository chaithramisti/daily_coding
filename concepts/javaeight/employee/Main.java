package concepts.javaeight.employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT", 80000),
                new Employee("David", "IT", 70000),
                new Employee("Sam", "IT", 60000),

                new Employee("Mike", "HR", 50000),
                new Employee("Sara", "HR", 45000),
                new Employee("Tom", "HR", 40000),

                new Employee("Alex", "Finance", 90000),
                new Employee("Bob", "Finance", 85000),
                new Employee("Rick", "Finance", 75000)
        );

        Map<String, Optional<Employee>> secondHighestByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparingInt(Employee::getSalary)
                                                        .reversed())
                                                .skip(1)
                                                .findFirst()
                                )
                        ));

        secondHighestByDept.forEach((dept, emp) -> {
            emp.ifPresent(employee ->
                    System.out.println(
                            dept + " -> " +
                                    employee.getName() + " : " +
                                    employee.getSalary()));
        });
        //step1 grouping by department
        Map<String,List<Employee>> groupedEmployee=
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupedEmployee);

        //step2 processing 1 department manually
       List<Employee> itEmployee=groupedEmployee.get("IT");
       itEmployee.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).skip(1).findFirst().get();
       System.out.println(itEmployee);

       //step 3 processing all department

      Map<String, Optional<Employee>> secondHighest= groupedEmployee.entrySet().stream().collect(Collectors.
               toMap(entry->entry.getKey(),entry->entry.getValue().stream()
                       .sorted(Comparator.comparingInt(Employee::getSalary)
                       .reversed()).skip(1).findFirst()));
      System.out.println(secondHighest);

    //Count employees in each drpartment
      //filtering-no,mapping-no,grouping-yes,sorting-no,aggregation-yes,collecting-yes
       Map<String,Long> e=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
       System.out.println(e);
       ///averagesalary by department
      Map<String,Double> averageSalaryByDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
      //max salary by department
        Map<String,Optional<Employee>> e3=employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary
        ))));
        Map<String, Optional<Employee>> maxSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

    }

}