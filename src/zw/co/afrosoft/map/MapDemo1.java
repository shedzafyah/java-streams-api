package zw.co.afrosoft.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("shelton",23,100),
                new Employee("owen",23,100),
                new Employee("kuda",14,500),
                new Employee("panashe",35,700),
                new Employee("nyasha",10,200),
                new Employee("romeo",20,400),
                new Employee("ashton",15,600)

        );

        employeeList.stream().filter(employee -> employee.getAge()<20).map(employee -> employee.getName()).sorted().forEach(System.out::println);
    }
}

class Employee{
    String name;
    int age;
    int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary=" + salary +
                '}';
    }
}
