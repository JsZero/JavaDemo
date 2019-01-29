package cn.neu.function;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {
    public static void main(String[] args) {
        // Supplier 接受一个泛型<T>, 接口方法是一个无参数的方法, 有一个类型为T的返回值
        Supplier<String> supplier = () -> "Supplier";

        System.out.println(supplier.get());

        // Consumer 接受一个泛型<T>, 接口方法是入参类型为T, 无返回值的方法
        Consumer<String> consumer = (x) -> System.out.println(x);
        consumer.accept("ass");

        // Predicate 接受一个泛型<T>, 接口方法的入参类型是T, 返回值是一个布尔值
        Predicate<String> predicate = (x) -> x.length() > 2;
        System.out.println(predicate.test("diff"));

    }
}
