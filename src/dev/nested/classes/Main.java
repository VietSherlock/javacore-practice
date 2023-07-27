package dev.nested.classes;

import dev.nested.classes.domain.Employee;
import dev.nested.classes.domain.StoreEmployee;

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

        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10922, "Cristiano", 2014, "Mercedes-HaNoi"),
                new StoreEmployee(10721, "Messi", 2023, "Mercedes-HaNoi"),
                new StoreEmployee(10512, "Scholes", 2018, "Mercedes-HoChiMinh"),
                new StoreEmployee(11721, "Bruno", 2020, "Mercedes-HaNoi"),
                new StoreEmployee(12878, "Casemiro", 2022, "Mercedes-DaNang")
        ));

        //  sort employees by yearStarted
        System.out.println("Sort employees:");
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for(Employee employee: employees){
            System.out.println(employee);
        }

        //  sort employees who are the same store by yearStarted
        System.out.println("Sort employees in a store:");
        storeEmployees.sort(new StoreEmployee().new StoreComparator<>());

        for(StoreEmployee storeEmployee : storeEmployees){
            System.out.println(storeEmployee);
        }
    }

}
