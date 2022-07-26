
class Car {
    public int no_of_tires;
    public String bodyType;

    Car() {
        no_of_tires = 4;
        bodyType = "Plastic";
    }
    public void reverseGear() {
        System.out.println("Reverse Gear is Applied...");
    }

    public void switchOnHeadlights() {
        System.out.println("Headlights turned on...");
    }
}

class BMW extends Car {
    public String modelName;
    BMW() {
        modelName = "x3";
    }
    public void topSpeed() {
        System.out.println("TopSpeed of BMW is 200 kmph");
    }
}

class Main {
    public static void main(String[] args) {
        BMW car1 = new BMW();
        car1.reverseGear();
        car1.switchOnHeadlights();
        car1.topSpeed();
    }
}

// Reverse Gear is Applied...
// Headlights turned on...
// TopSpeed of BMW is 200 kmph
