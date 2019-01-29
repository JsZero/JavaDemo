package cn.neu.methodref;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodRefDemo {
    public static void main(String[] args) {
        // 构造方法引用
        final Car car = Car.create(Car::new);
        List<Car> cars = Arrays.asList(car);
        System.out.println("===========================");
        // 静态方法引用
        cars.forEach(Car::collide);
        System.out.println("===========================");
        // 成员方法引用
        cars.forEach(Car::repair);
        System.out.println("===========================");
        // 特定对象的成员方法引用
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }

    public static class Car {
        public static Car create(final Supplier<Car> supplier) {
            return supplier.get();
        }

        public static void collide(final Car car) {
            System.out.println("Collided " + car.toString());
        }

        public void follow(final Car another) {
            System.out.println(this.toString() + " following the " + another.toString());
        }

        public void repair() {
            System.out.println("Repaired " + this.toString());
        }
    }
}
