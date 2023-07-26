package dev.nested.classes;

import dev.nested.classes.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1005, "Carole", 2020),
                new Employee(1002, "Jane", 2021),
                new Employee(1762, "Viet", 2022),
                new Employee(26716, "Anna", 2023),
                new Employee(98721, "Tunde", 2019)
        ));

        employees.sort(new Employee.EmployeeComparator<>("yearStarted"));

        for(Employee employee: employees){
            System.out.println(employee);
        }

    }

}
