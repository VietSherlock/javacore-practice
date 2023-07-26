package dev.nested.classes.domain;

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

        private static final String YEAR_STARTED = "yearStarted";
        private static final String NAME = "name";
        private static final String EMPLOYEE_ID = "employeeId";
        private String sortType;

//        // normal way
//        public EmployeeComparator() {
//            sortType = "name";
//        }

        // master way
        public EmployeeComparator() {
            this("name");   // this("name") call to another constructor within same class EmployeeComparator(String sortType)
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {

            if(YEAR_STARTED.equalsIgnoreCase(sortType)){
                return o1.yearStarted - o2.yearStarted;
            }
            return o1.getName().compareTo(o2.getName());
        }
    }

    private int employeeId;
    private String name;
    private int yearStarted;

    public Employee() {
    }

    public Employee(int employeeId, String name, int yearStarted) {
        this.employeeId = employeeId;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}
