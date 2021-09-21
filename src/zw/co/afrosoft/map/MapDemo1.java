package zw.co.afrosoft.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("shelton",23,100,"Admin"),
                new Employee("owen",23,100,"User"),
                new Employee("kuda",14,500,"Admin"),
                new Employee("panashe",35,700,"User"),
                new Employee("nyasha",10,200,"Admin"),
                new Employee("romeo",20,400,"User"),
                new Employee("ashton",15,600,"User")

        );

        employeeList.stream().filter(employee -> employee.getAge()<20).map(employee -> employee.getName()).sorted().forEach(System.out::println);

        //using anyMatch
        boolean any = employeeList.stream().anyMatch(employee -> employee.getAccount().matches("Admin"));
        //nonMatch
         boolean none =employeeList.stream().noneMatch(employee -> employee.getAccount().matches("User"));
        //allMatch
        boolean all =employeeList.stream().allMatch(employee -> employee.getAccount().matches("Admin"));

        System.out.println(all);
        System.out.println(any);
        System.out.println(none);

    }
}

class Employee{
    String name;
    int age;
    int salary;
    String account;

    public Employee(String name, int age, int salary, String account) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.account = account;
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", account='" + account + '\'' +
                '}';
    }
}
