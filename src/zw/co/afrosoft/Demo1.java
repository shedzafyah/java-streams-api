package zw.co.afrosoft;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo1 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Use of Count
       long num= numberList.stream().filter(n->n%2==0).count();
        System.out.println(num);

        //Use of Max
        Optional<Integer> maxValue =numberList.stream().max((val1,val2)->{ return val1.compareTo(val2);});
        System.out.println(maxValue.get());

        //use of Min
        Optional<Integer> minValue =numberList.stream().min((val1,val2)->{return val1.compareTo(val2);});
        System.out.println(minValue.get());
    }
}
