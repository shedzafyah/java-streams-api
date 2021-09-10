package zw.co.afrosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filter3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Boy",null,"girl",null,"father","mother");
        List<String> notNullWords = new ArrayList<>();

        notNullWords= words.stream().filter(Objects::nonNull).collect(Collectors.toList());
       // words.stream().filter(n->n!=null).forEach(System.out::println);
        System.out.println(notNullWords);
        //System.out.println(words);
    }
}
