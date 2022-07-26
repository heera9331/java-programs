// super class contain a method called display() => display "Super class display method"
class Super {
    void display() {
        System.out.println("Super class display method");
    }
}

// Sub inherited/extends from super class Super class display method
// overrided by subclass and display message => "Sub class display method"
class Sub extends Super{
    @Override
    void display() {
        System.out.println("Sub class display method");
    }
}

// here super class and sub class contain same method with same singature
class Main {
    public static void main(String[] args) {
        // we passes reference of Super class into super referenced object 
        // and class method always => Super class display method call.
        // Reason: super class reference have the information of super member.
        Super s = new Super();
        s.display();

        // we create reference object of Super class and create object of sub class.
        // and call method, always overrided method invoke/execute.
        Super s1 = new Sub();
        s1.display();

        // we create reference object of sub class and object of sub and call
        // method sub class display method will call.
        Sub s2 = new Sub();
        s2.display();

        // convert super to sub
        // Sub s3 = new Super();
        // s3.display();
        
    }
}
