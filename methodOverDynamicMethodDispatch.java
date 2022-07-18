/*
* Author: Heera Singh Lodhi
* Date: 18/07/2022
* Program: Method overiding
* */
// method overriding
class Super {
    public void display() {
        System.out.println("Super");
    }
}

class Sub extends Super {
    public void display() {
        System.out.println("Sub class");
    }
}
class Main {

    public static void main(String args[]) {
        Sub s1 = new Sub();
        s1.display();

//        Dynamic method dispatch
        Super su = new Sub();
        su.display();
    }
}
