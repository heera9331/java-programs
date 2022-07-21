/*
Author: Heera Singh Lodhi
Date: 21/07/2022
Program: Abstract class demonstration
 */
abstract class Super {
    abstract void meth1();
    abstract void meth2();
    void meth3() {
        System.out.println("Meth3");
    }
}

abstract class Sub extends Super {
    @java.lang.Override
    void meth1() {
        System.out.println("meth1");
    }
}

class SSub extends Sub {
    @java.lang.Override
    void meth2() {
        System.out.println("Meth2 class SSub");
    }
}

class Main {
    public static void main(String[] args) {
        Super s = new SSub();
        s.meth1();
        s.meth2();
        s.meth3();
    }
}
