package cn.neu.demo.abstractclass;

import java.sql.SQLOutput;

class Creature {
    private final int range = 10;
    private final int env[] = new int[range()];

    public Creature() {
    }

    public int range() {
        return range;
    }

    public int[] env() {
        return env;
    }

    public int thisRange() {
        return this.range;
    }
}

class Ant extends Creature {
    private final int range = 2;

    public Ant() {
    }

    @Override
    public int range() {
        return range;
    }

    public int superRange() {
        return super.range();
    }

    public int thisRange() {
        return this.range();
    }
}

public class ConstructSeq {
    public static void main(String[] args) {
        Ant a = new Ant();
        System.out.println(a.range()); // 2
        System.out.println(a.thisRange()); // 2
        System.out.println(a.superRange()); // 10
        Creature c = a;
        System.out.println(c.range()); // 2
        System.out.println(c.thisRange()); // 2

        System.out.println(new Ant().env().length);
    }
}
