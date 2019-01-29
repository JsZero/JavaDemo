package cn.neu.demo.abstractclass;

public class Initial {
    private final int range = 10;
    private final int env[] = new int[range()];

    public int range() {
        return range;
    }

    public int[] env() {
        return env;
    }

    public static void main(String[] args) {
        System.out.println(new Initial().env().length);
    }
}
