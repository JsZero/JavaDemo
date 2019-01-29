package cn.neu.demo.attr.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListStreamDemo {
    public static void main(String[] args) {
        List strList = Arrays.asList("1", "2", "3");
        strList.stream().map((Object i) -> Integer.parseInt(i.toString())).forEach(System.out::println);
        System.out.println("==============================");
        String concat = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println(concat);
//        strList.parallelStream().map(i -> Integer.parseInt(i.toString())).forEach(System.out::println);
//                .map(intezer -> Integer.parseInt(intezer))
//                .forEach(strInteger -> System.out.println("each integer: " + strInteger));

    }
}
