package JAVA_Collection;

import java.lang.*;
import java.util.*;

class Employee2 {
    int id;
    String name,department;

    public Employee2(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
}

class SortbyId implements Comparator<Employee2> {
    public int compare(Employee2 employee1, Employee2 employee2){
        return employee1.id - employee2.id;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Employee2> workers = new ArrayList<>();

        Employee2 employee1 = new Employee2(11, "Kim Coding", "Software Engineering");
        Employee2 employee2 = new Employee2(5, "Hello World", "Growth Marketing");
        Employee2 employee3 = new Employee2(7, "Park Hacker", "Software Engineering");

        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);

        for (Employee2 employee:workers) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }

        Collections.sort(workers,new SortbyId());

        for (Employee2 employee:workers) {
            System.out.println(employee.id + " " + employee.name + " " + employee.department + " ");
        }
    }
}
