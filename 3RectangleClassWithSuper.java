  
/*
*
* Author: Heera Singh Lodhi
* Date: 18/07/2022
* Program: Rectangle class with super keyword
*/

class Rectangle {
    int length;
    int breadth;
    int x = 10;
    public Rectangle() {
        length = breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println("Parent x: "+x);
    }

}
