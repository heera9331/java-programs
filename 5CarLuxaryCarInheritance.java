
/*
* Author: Heera Singh Lodhi
* Date: 19/07/2022
* Program: One more example of inheritance with method overriding
*/


class Car {
    void start() {
        System.out.println("Car started");
    }

    void accelerate() {
        System.out.println("Car is accelerated");
    }

    void changeGear() {
        System.out.println("Car gear changed");
    }
}

class LuxaryCar extends Car {
    @java.lang.Override
    void changeGear() {
        System.out.println("Automatic gear");
    }
    void openRoof() {
        System.out.println("Sun roof is opened");
    }
}

class Main {
    public static void main(String[] args) {
        LuxaryCar l = new LuxaryCar();
        l.start();
        l.changeGear();
        l.accelerate();
        l.openRoof();

        Car c1 = new LuxaryCar();
        c1.start();
        c1.changeGear();
        c1.accelerate();
    }
}
