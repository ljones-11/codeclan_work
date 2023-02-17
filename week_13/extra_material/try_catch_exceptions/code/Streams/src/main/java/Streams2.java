import java.util.stream.Stream;

public class Streams2 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,8,9)
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
        Stream.of(2,5,6,8,7,5,2)
                .filter(num -> num % 2 == 0)
                .sorted()
                .forEach(System.out::println);
        Stream.of("Apple", "Orange", "Banana")
                .limit(2)
                .forEach(System.out::println);
        double avg = Stream.of(4,5,6,5,4,5,6,7,1,100)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        double max = Stream.of(4,5,6,5,4,5,6,7,1,100)
                .mapToInt(n -> n)
                .max()
                .getAsInt();
        Stream.of("dfd", "dfddd", "dddddd")
                .peek(val -> System.out.println("Value was " + val))
                .map(String::toUpperCase)
                .peek(val -> System.out.println("Value now is " + val))
                .forEach(n -> System.out.println("done"));




    }
}
