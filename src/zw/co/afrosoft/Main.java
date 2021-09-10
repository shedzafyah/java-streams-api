package zw.co.afrosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /*
            1. Stream Integer

                IntStream.range(1,10)
                .skip(2)
                .forEach(x-> System.out.println(x));

            2. Stream Summing

                 System.out.println(
                    IntStream.range(1,5)
                    .skip(2)
                    .sum());

            3. Stream.of Sorted and findFirst

                 Stream.of("Shelton","Ashton","Owen")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

            4. Stream from Array, Filter, Sort & print

                 String[] name = {"Keith","Tyfa","Shelton","Rodney","Mernad","Lionnel"};
                 Arrays.stream(name)
                     .filter(x-> x.startsWith("L"))
                     .sorted()
                     .forEach(System.out::println);

             5. average of squares of int array
                    Arrays.stream(new int[]{1,2,3,4,5,6,7,8,9,10})
                        .map(x->x*x)
                        .average()
                        .ifPresent(System.out::println);

         */

        List<Integer> numbers = Arrays.asList(10,15,20,25,30,35);
        List<Integer>evenNumberList = new ArrayList<>();

       // evenNumberList=numbers.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());

       numbers.stream().filter(n->n%2==0).sorted().forEach(System.out::println);


    }
}
