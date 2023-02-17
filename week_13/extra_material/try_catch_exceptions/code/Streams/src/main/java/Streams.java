import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static int addTwo(int input){
        return input + 2;
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ben", "James", "Kyle", "Josh");

        names.stream()
                .map(String::toUpperCase)
//                .forEach(name -> System.out.println(name));
//                .forEach(System.out::println);
                .collect(Collectors.toList());
        Stream<String> fruits = Stream.of("Apple", "Pear", "Banana");

        fruits.map(String::toLowerCase).forEach(name -> System.out.println(name));

        Stream<Integer> intStream = Stream.of(1,2,3,4);
//            .map(Streams::addTwo);

        int total = intStream.reduce(0,(sum, nextNum) -> sum + nextNum);
        System.out.println(total);

    }


}
