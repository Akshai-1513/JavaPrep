package Practice.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams_collectors {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rama","Tom","Samuel","Tom");
    /*
       Collector ->  A Collector is used to collect the result of a stream into a container like list,set, etc....
        Methods:
        1️⃣ toList() -> to list
        2️⃣ toSet() -> to set
        3️⃣ toMap() -> to map
        4️⃣ groupingBy() -> it groups all the elements, example frequency of the array.
        5️⃣ partitioningBy()
        6️⃣ joining()
        7️⃣ counting()
        8️⃣ summarizingInt()
     */

//  1) toList():
//        List<String> smallNames = names.stream().filter(n -> n.length() < 5).collect(Collectors.toList());
//        System.out.println(smallNames);
//        Output : [Rama, Tom]

//  2) toSet():
//        Set<String> set = names.stream().collect(Collectors.toSet());
//        System.out.println(set);
//        Output : [Rama, Tom, Samuel]

//  3) toMap():
//        Map<String, Integer> map = names.stream().collect(Collectors.toMap(
//                name -> name,
//                len -> len.length()
//                ));
//        System.out.println(map); -> to handle unique values


//        Map<String, Integer> map = names.stream().collect(Collectors.toMap(
//                name -> name,
//                len -> len.length(),
//                (existing, newValue) -> existing
//        ));
//        System.out.println(map); ->  this way we can manage duplicate
//        Output: {Samuel=6, Tom=3, Rama=4}

//  4) groupingBy():
//        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
//        System.out.println(map);
//        Output: {Samuel=1, Tom=2, Rama=1}

//  5) partitioningBy():
//        Map<Boolean, List<String>> result =
//                names.stream()
//                        .collect(Collectors.partitioningBy(n -> n.length() > 3));
//        System.out.println(result);
//        Output : {false=[Tom, Tom], true=[Rama, Samuel]}

//  6) joiing():
//        String res = names.stream().collect(Collectors.joining(" -> "));
//        System.out.println(res);
//        Output: Rama -> Tom -> Samuel -> Tom

//  7) counting():
//        long count = names.stream().collect(Collectors.counting());
//        System.out.println(count);
//        Output: 4

//  8) summarizingInt():
//        List<Integer> list = Arrays.asList(2,3,4,3,2,4,5);
//        IntSummaryStatistics stats =
//                list.stream()
//                        .collect(Collectors.summarizingInt(n -> n));
//        System.out.println(stats);
//        Output: IntSummaryStatistics{count=7, sum=23, min=2, average=3.285714, max=5}

    }
}
