import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

//        filter(predicate) - predicate means boolean valued
//  Q) find the name starts with 'A'
        List<String> names = List.of("Aman","Aditya","Abhishek","Gaurab","Gucchi");
        names.stream().filter(name->name.startsWith("A")).collect(Collectors.toList()).forEach(e->{
            System.out.println(e);
        });

//        map(function)
// Q) square each number of an array
        List<Integer> numbers = Arrays.asList(2,3,6,3,9,11,3,4);
        List<Integer> squareNumbers = numbers.stream().map(n-> n * n).collect(Collectors.toList());
        System.out.println(squareNumbers);

//        distinct - removes dublicate elements

        List<Integer> dublicate = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("after removing dublicate elements: "+dublicate);

        //    sorted
        numbers.stream().sorted().forEach(System.out::println);

//        max
        Integer integer = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("max: "+integer);

//        min
        Integer integer1 = numbers.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("min: "+integer1);

    }

}
