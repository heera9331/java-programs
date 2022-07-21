/*
Author: Heera Singh Lodhi
Date: 21/07/2022
Program: Interface demonstration
 */

interface Super {
    void meth1();
    void meth2();
}

class Sub implements Super {
    @java.lang.Override
    public void meth1() {
        System.out.println("meth1");
    }

    @java.lang.Override
    public void meth2() {
        System.out.println("meth2");
    }
}

class Interface {
    public static void main(String[] args) {
        Super su = new Sub();
        su.meth1();
        su.meth2();
    }
}
