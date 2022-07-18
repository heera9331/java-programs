/*
*
* Author: Heera Singh Lodhi
* Date: 18/07/2022
* Program: Cuboid class derived frome rectangle class
*/

class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        length = breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle {
    int height;
    public Cuboid() {
        height = 1;
    }

    public Cuboid(int h, int l, int b) {
        super(l, b);
        height = h;
    }

    int getVolume() {
        return length*breadth*height;
    }
}

class Main {
    public static void main(String args[]) {
        Cuboid c = new Cuboid(10, 2, 2);
        System.out.println(c.getVolume());
    }

}
