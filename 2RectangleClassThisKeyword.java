    
/*
* Author: Heera Singh Lodhi
* Date: 18/07/2022
* Program: Rectangle with this keyword
 */
class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length: "+this.length);
        System.out.println("Breadth: "+this.breadth);

    }
}

class Main {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(5, 10);
        r1.display();

        Rectangle r2 = new Rectangle(4, 3);
        r2.display();
    }
}
