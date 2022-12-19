import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//       create a list and filter even number
//        three ways to create a list

        List<Integer> list = List.of(1,4,2,66,33,44,88,31);

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(11);
        list1.add(121);
        list1.add(112);
        list1.add(142);

        List<Integer> list2 = Arrays.asList(11,22,33,44,55,66,77,88);

//        without stream
        List<Integer> newlist = new ArrayList<>();
//        using for-each loop

        for(Integer i:list){
            if(i % 2 == 0){
                newlist.add(i);
            }
        }

        System.out.println(list);
        System.out.println(newlist);
//-------------------------------------------------------------------------
        System.out.println("-------------Using Stream API---------------------------------");
//        with stream api
//        Stream<Integer> stream = list.stream();
//        List<Integer> evenList = stream.filter(i-> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenList);

        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}