package zw.co.afrosoft;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamsDemo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
            new Student("Shedza",0),
                new Student("Cledza",10),
                new Student("Dadza",40),
                new Student("Hidza",20),
                new Student("Odza",90),
                new Student("Wedza",17),
                new Student("Wedza",24),
                new Student("Wedza",11)

        );
        //using stream-> sequential stream
        studentList.stream().filter(s->s.getScore()>23).limit(3).forEach(s-> System.out.println(s.getName() + " " +s.getScore()));

        //Using stream -> parallel stream
        studentList.parallelStream().filter(student -> student.getScore()>23).limit(3).forEach(student -> System.out.println( student.getName() + " " +student.getScore()));
    }
}
class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}