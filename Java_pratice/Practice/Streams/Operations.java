package Practice.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Operations {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,43,14,3,9,22,12);

//        Stream<Integer> data = nums.stream(); // Basically as collection used to manipulate the data efficiently
//        data.forEach(n -> System.out.println(n)); // The stream can be used once, if we try to access once again.
//        System.out.println(data.count());// It will throw exception -> "IllegalStateException"

    /*
    INTERMEDIATE Operations (Lazy)
        1) filter() -> select elements based on the conditions.
        2) map() -> make the changes in the list based on the conditions. Transform one element -> one element.
        3) flatMap() -> similar to the map but, transforms one element -> multiple elements.
        4) distinct() -> Finds the distinct values.
        5) sorted() -> sort the elements.
        6) limit() -> gives the limited values based on input.
        7) skip() -> gives values except those values.
        8) peek() -> used for debugging
     */

//  1) filter():
//        nums.stream().filter(n -> n % 2 == 0).forEach(i -> System.out.println(i));
//        Output : 2  14  22  12

//  2) map():
//        nums.stream().map(n -> n * 2).forEach(i -> System.out.print(i + " "));
//        Output : 4 86 28 6 18 44 24

//  3) flatMap(): ---- The things that are not possible by the map() will be done with the help of the flatmap.
//        List<String> list = Arrays.asList("Java", "Program");
//        list.stream().flatMap(i -> Arrays.stream(i.split(""))).forEach(System.out::println);
//        """ .forEach(x -> System.out.println(x)); --->  is similar to the .forEach(System.out::println); """
//        Output: J a v a P r o g r a m

//  4) distinct():
//        nums.stream().distinct().forEach(System.out::println);
//        Output: 2 43 14 3 9 22 12

//  5) sorted():
//        Descending Order -> nums.stream().sorted((a, b) -> b - a).forEach(System.out::println);
//        Ascending Order -> nums.stream().sorted().forEach(System.out::println);

//  6) limit():
//        nums.stream().limit(3).forEach(System.out::println);
//        Output : 2  43  14

//  7) skip():
//        nums.stream().skip(5).forEach(System.out::println);
//        Output : 22  12

//  8) peek();
//        nums.stream().peek(n -> System.out.print("Before: " + n)).map(n -> n * 2).forEach(n -> System.out.println(" -> "  + n));
/*
        Before: 2 -> 4
        Before: 43 -> 86
        Before: 14 -> 28
        Before: 3 -> 6
        Before: 9 -> 18
        Before: 22 -> 44
        Before: 12 -> 24
 */

    /*
        TERMINAL Operations:
            1) forEach() -> helps to loop through the stream.
            2) collect() -> the streams actually store the value as a stream, to convert it to any collection this method is used.
            3) reduce() -> it combines all the elements to one single unit.
            4) count() -> it counts the value based on the condition, it returns "long" type
            5) min() / max() -> it finds the min or max value.
            6) anyMatch() / allMatch() / noneMatch() -> return boolean based on the condition.
            7) findFirst() / findAny() -> returns first element / returns any element.
     */

//  1) forEach():
//        nums.stream().forEach(i -> System.out.println(i));

//  2) collect():
//        Set<Integer> set = nums.stream().collect(Collectors.toSet());

//  3) reduce():
//        int sum = nums.stream().reduce(0, (a, b) -> a + b);
//        System.out.println(sum);
//        Output : 105

//  4) count():
//        long count = nums.stream().filter(n -> n > 12).count();
//        System.out.println(count);
//        Output : 3

//  5) min() / max():
//        Optional<Integer> min = nums.stream().min(Integer::compare);
//        Optional<Integer> max = nums.stream().max(Integer::compare);
//        System.out.println(min + " " + max);
//        Output: Optional[2]  Optional[43]

//  6) anyMatch() / allMatch() / noneMatch():
//        boolean anyMatch = nums.stream().anyMatch(n -> n > 14);
//        boolean allMatch = nums.stream().allMatch(n -> n == 12);
//        boolean nonMatch = nums.stream().noneMatch(n -> n < 0);
//        System.out.println(anyMatch + " " + allMatch + " " + nonMatch);
//        Output: true false true

//  7) findFirst() / findAny()
//        Optional<Integer> first= nums.stream().findFirst();
//        Optional<Integer> any= nums.stream().findAny();
//        System.out.println(first + " " + any);
//        Output: Optional[2] Optional[2]


    /*
        Note : intermediate (lazy) operations depend on the terminal operation to actually execute.
     */
    }
}
