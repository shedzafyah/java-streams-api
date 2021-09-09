package zw.co.afrosoft;

import java.util.Arrays;
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
         */



    }
}
