package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("Пidr",100,228);
        Employee emp2 = new Employee("Лox",-100,228);
        Employee emp3 = new Employee("Аhmo",18,1);
        Employee emp4 = new Employee("Вot",10,228);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        System.out.println("Before : " + employees.toString());

//        Collections.sort(employees);
        //или
        //Collections.sort(employees, new ageComparator());
        Collections.sort(employees, new salaryComparator());

        System.out.println("After : " + employees.toString());
    }


}

class Employee implements Comparable<Employee>{
    public String name;
    public int age;
    public int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {
//        if (this.age == anotherEmp.age){
//            return 0;
//        } else if (this.age < anotherEmp.age){
//            return -1;
//        } else {
//            return 1;
//        }
        //или просто
        //return this.age-anotherEmp.age;
        //а так же
        //return this.age.compareTo(anotherEmp.age);
        // по имени
        return this.name.compareTo(anotherEmp.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class ageComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.age == emp2.age){
            return 0;
        } else if (emp1.age < emp2.age){
            return -1;
        } else {
            return 1;
        }
    }
}

class salaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.salary == emp2.salary){
            return 0;
        }
        else if (emp1.salary < emp2.salary){
            return -1;
        }
        else {
            return 1;
        }
    }
}




