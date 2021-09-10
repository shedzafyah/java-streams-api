package zw.co.afrosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Shelton","Ashton","Hilton","Elton","Darlington","Takunda");
        //List<String> filteredList = new ArrayList<>();
       //filteredList = nameList.stream().filter(n->n.length()<8 && n.length()>6).filter(n->n.endsWith("ton")).collect(Collectors.toList());
       //System.out.println(filteredList);

        nameList.stream().filter(n->n.endsWith("ton")).filter(n->n.length()>6 && n.length()<8).forEach(System.out::println);

    }
}
