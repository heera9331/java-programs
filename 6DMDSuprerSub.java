
class Super {
    void math1() {
        System.out.println("math1");
    }

    void math2() {
        System.out.println("math2");
    }
}

class Sub extends Super {
    @java.lang.Override
    void math2() {
        System.out.println("math2 sub");
    }

    void math3() {
        System.out.println("math3");
    }
}

class Main {
    public static void main(String[] args) {
        Super su = new Sub();
        su.math1();
        su.math2();
    }
}
