
/*
* Author: Heera Singh Lodhi
* Date: 18/07/2022
* Program: Demonstrate inheritance
* */

class TV {
    void switchOn() {
        System.out.println("TV switched ON");
    }

    void changeChannel() {
        System.out.println("TV channel changed");
    }
}

class SmartTV extends TV {
    @java.lang.Override
    void switchOn() {
        System.out.println("Smart TV switched ON");
    }

    @java.lang.Override
    void changeChannel() {
        System.out.println("Smart TV channel changed");
    }

    void browse() {
        System.out.println("Browsing");
    }
}

class Main {
    public static void main(String args[]) {
        TV t1 = new TV();
        t1.switchOn();
        t1.changeChannel();
        SmartTV s1 = new SmartTV();
        s1.switchOn();
        s1.changeChannel();
        s1.browse();

    }
}
