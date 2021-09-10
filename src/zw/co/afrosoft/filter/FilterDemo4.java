package zw.co.afrosoft.filter;

import java.util.Arrays;
import java.util.List;

class Student{
    String firstname;
    String lastname;
    int age;

    public Student(String firstname,String lastname,int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }
}

public class FilterDemo4 {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
          new Student("shelton","shamuyarira",23),
          new Student("Tafadzwa","pundo",21),
          new Student("keith","charedzera",20)
        );

        studentList.stream().filter(s->s.age>=20 && s.age<23).forEach(System.out::println);
    }
}
