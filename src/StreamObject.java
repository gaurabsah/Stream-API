import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

//        Stream is a interface
//        Stream<Object> emptyStream = Stream.empty();
//        System.out.println(emptyStream);

//        ----------------------------------------------------

        String[] names = {"Gaurab, Saurab, Dev, Sagar"};
//        to print the string array using stream -
        Stream<String> nameStream = Stream.of(names);
        nameStream.forEach(e->{
            System.out.println(e);
        });

//        ------------------------------------------------------

//        to filter the names starting with 'S'
        List<String> strList = Arrays.asList("Gaurab","Saurab","Dev","Sagar");
        List<String> s = strList.stream().filter(name->name.startsWith("S")).collect(Collectors.toList());
        System.out.println("names starting with 'S': "+s);

//        ---------------------------------------------------------

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(11);
        list1.add(121);
        list1.add(112);
        list1.add(142);

        Stream stream = list1.stream();
        stream.forEach(e->{
            System.out.println(e);
        });
    }
}
