package Learning.Streams;

import java.util.*;


// Streams processes the data.
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("A", 1000));
        employeeList.add(new Employee("B", 2000));
        employeeList.add(new Employee("C", 1500));
        employeeList.add(new Employee("D", 2500));
        employeeList.add(new Employee("E", 2000));


//        Optional<Employee> maxSal = employeeList.stream().max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
//        System.out.println("Maximum Salary : " + maxSal);
//
//        Optional<Employee> minSal = employeeList.stream().max((e1, e2) -> (int) (e1.getSalary() + e2.getSalary()));
//        System.out.println("Minimum Salary : " + minSal);


//    1️) Get all employee names ---> Expected result: [A, B, C, D, E]
//      employeeList.stream().map(e -> e.getName()).forEach(i -> System.out.print(i + " "));

//    2) Employee with sal greater than or equal to 2000.
//        employeeList.stream().filter(e -> e.getSalary() >= 2000).map(e -> e.getName()).forEach(i -> System.out.print(i + " "));

    }
}
