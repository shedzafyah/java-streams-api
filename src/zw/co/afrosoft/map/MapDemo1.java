package zw.co.afrosoft.map;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> vehiclesModels = Arrays.asList("madza","toyota","ranger","nissan","benz","bmw");
        vehiclesModels.stream().filter(s->s.length()>2&& s.length()<5).map(v->v.toUpperCase()).sorted().forEach(g-> System.out.println(g));
    }
}
